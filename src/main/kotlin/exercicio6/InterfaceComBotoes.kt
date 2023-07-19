package exercicio6

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import java.awt.BorderLayout
import java.awt.Color
import java.awt.Font
import java.awt.GridLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class TelaGuardaVolumes : JFrame(), ActionListener {
    private val guardaVolumes: GuardaVolumes = GuardaVolumes()
    private val textFieldMarca: JTextField = JTextField()
    private val textFieldModelo: JTextField = JTextField()
    private val textFieldIdentificacao: JTextField = JTextField()
    private val labelStatus: JLabel = JLabel()

    init {
        // Configurações básicas da janela
        title = "Guarda-Volumes"
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(400, 200)
        layout = BorderLayout()
        contentPane.background = Color(219, 226, 237)

        // Painel para os campos de entrada
        val panelInputs = JPanel()
        panelInputs.layout = GridLayout(3, 2)
        panelInputs.background = Color(219, 226, 237)
        panelInputs.add(JLabel("Marca:")).apply {
            font = Font("Arial", Font.BOLD, 14)
        }
        panelInputs.add(textFieldMarca).apply {
            font = Font("Arial", Font.PLAIN, 14)
        }
        panelInputs.add(JLabel("Modelo:")).apply {
            font = Font("Arial", Font.BOLD, 14)
        }
        panelInputs.add(textFieldModelo).apply {
            font = Font("Arial", Font.PLAIN, 14)
        }
        panelInputs.add(JLabel("Identificação:")).apply {
            font = Font("Arial", Font.BOLD, 14)
        }
        panelInputs.add(textFieldIdentificacao).apply {
            font = Font("Arial", Font.PLAIN, 14)
        }
        add(panelInputs, BorderLayout.CENTER)

        // Painel para os botões
        val panelButtons = JPanel()
        panelButtons.layout = GridLayout(2, 2)
        panelButtons.background = Color(219, 226, 237)
        val buttonGuardar = JButton("Guardar")
        buttonGuardar.addActionListener(this)
        panelButtons.add(buttonGuardar).apply {
            font = Font("Arial", Font.BOLD, 14)
            foreground = Color.WHITE
            background = Color(59, 89, 182)
        }
        val buttonMostrarTodas = JButton("Mostrar Todas")
        buttonMostrarTodas.addActionListener(this)
        panelButtons.add(buttonMostrarTodas).apply {
            font = Font("Arial", Font.BOLD, 14)
            foreground = Color.WHITE
            background = Color(59, 89, 182)
        }
        val buttonMostrarPorId = JButton("Mostrar por ID")
        buttonMostrarPorId.addActionListener(this)
        panelButtons.add(buttonMostrarPorId).apply {
            font = Font("Arial", Font.BOLD, 14)
            foreground = Color.WHITE
            background = Color(59, 89, 182)
        }
        val buttonDevolver = JButton("Devolver")
        buttonDevolver.addActionListener(this)
        panelButtons.add(buttonDevolver).apply {
            font = Font("Arial", Font.BOLD, 14)
            foreground = Color.WHITE
            background = Color(59, 89, 182)
        }
        add(panelButtons, BorderLayout.SOUTH)

        // Painel para exibir mensagens de status
        val panelStatus = JPanel()
        panelStatus.add(labelStatus).apply {
            font = Font("Arial", Font.BOLD, 16)
            foreground = Color(59, 89, 182)
        }
        panelStatus.background = Color(219, 226, 237)
        add(panelStatus, BorderLayout.NORTH)
    }

    override fun actionPerformed(e: ActionEvent) {
        when (e.actionCommand) {
            "Guardar" -> {
                val marca = textFieldMarca.text.trim()
                val modelo = textFieldModelo.text.trim()

                if (marca.isNotEmpty() && modelo.isNotEmpty()) {
                    val peca = Roupas(marca, modelo)
                    val listaDePecas = arrayListOf(peca)
                    val id = guardaVolumes.guardarPecas(listaDePecas)
                    labelStatus.text = "Peças guardadas com o identificador: $id"
                } else {
                    labelStatus.text = "Por favor, preencha todos os campos."
                }
            }
            "Mostrar Todas" -> {
                labelStatus.text = ""
                guardaVolumes.mostrarPecas()
            }
            "Mostrar por ID" -> {
                val identificacao = textFieldIdentificacao.text.trim().toIntOrNull()
                if (identificacao != null) {
                    labelStatus.text = ""
                    guardaVolumes.mostrarPecas(identificacao)
                } else {
                    labelStatus.text = "Identificação inválida."
                }
            }
            "Devolver" -> {
                val identificacao = textFieldIdentificacao.text.trim().toIntOrNull()
                if (identificacao != null) {
                    guardaVolumes.devolverPecas(identificacao)
                    labelStatus.text = "Peças devolvidas!"
                } else {
                    labelStatus.text = "Identificação inválida."
                }
            }
        }
    }
}

fun main() {
    val telaGuardaVolumes = TelaGuardaVolumes()
    telaGuardaVolumes.isVisible = true
}

