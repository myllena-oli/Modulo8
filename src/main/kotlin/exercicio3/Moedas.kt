package exercicio3

import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal
import java.net.HttpURLConnection
import java.net.URI
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class Moedas(val nome: String, val cotacao: Double) {

    companion object {
        private const val API_URL = "https://economia.awesomeapi.com.br/json/all"

        fun obterCotacoes(): Map<String, Double> {
            val uri = URI(API_URL)
            val connection = uri.toURL().openConnection() as HttpURLConnection
            connection.requestMethod = "GET"

            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                val inputStream = connection.inputStream
                val reader = BufferedReader(InputStreamReader(inputStream))
                val response = StringBuilder()
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    response.append(line)
                }
                reader.close()

                val json = JSONObject(response.toString())

                val cotacoes = mutableMapOf<String, Double>()
                cotacoes["Dólar americano"] = json.getJSONObject("USD").getDouble("ask")
                cotacoes["Dólar canadense"] = json.getJSONObject("CAD").getDouble("ask")
                cotacoes["Euro"] = json.getJSONObject("EUR").getDouble("ask")
                cotacoes["Libra Esterlina"] = json.getJSONObject("GBP").getDouble("ask")

            return cotacoes
            } else {
                throw RuntimeException("Erro na solicitação HTTP. Código de resposta: $responseCode")
            }
        }
    }

    fun preencherMoeda(moeda: String): Moedas {
        val cotacoes = obterCotacoes()

        return when (moeda.lowercase(Locale.getDefault())) {
            "dólar americano" -> Moedas("Dólar americano", cotacoes["Dólar americano"] ?: 0.0)
            "dólar canadense" -> Moedas("Dólar canadense", cotacoes["Dólar canadense"] ?: 0.0)
            "euro" -> Moedas("Euro", cotacoes["Euro"] ?: 0.0)
            "libra esterlina" -> Moedas("Libra Esterlina", cotacoes["Libra Esterlina"] ?: 0.0)
            else -> throw IllegalArgumentException("Tipo de moeda inválido. ")
        }
    }

    fun converterParaReal(valor: BigDecimal, moeda: Moedas): BigDecimal {
        return valor.multiply(BigDecimal.valueOf(moeda.cotacao))
    }

    fun obterDiaAtual(): String {
        val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val date = Date()
        return dateFormat.format(date)
    }
}
