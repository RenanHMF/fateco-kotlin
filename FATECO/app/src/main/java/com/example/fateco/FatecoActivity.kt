package com.example.funfatec

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.room.Room
import com.example.fateco.AppDatabase
import com.example.fateco.Stats


class FatecoActivity : AppCompatActivity() {
    lateinit var db: AppDatabase;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fateco)

        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java,"banco.db").allowMainThreadQueries().build()

        //Esconder barra
        getSupportActionBar()?.hide();

        val buttonGoBack: ImageButton = findViewById(R.id.imgGoBackFatecoButton)

        buttonGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }

        val txtFATECO : TextView = findViewById(R.id.txtFATECO)
        val btnVerificarResposta : Button = findViewById(R.id.btnVerificarResposta)

        // Tentativa linha 1
        val letra0 : EditText = findViewById(R.id.letra0)
        val letra1 : EditText = findViewById(R.id.letra1)
        val letra2 : EditText = findViewById(R.id.letra2)
        val letra3 : EditText = findViewById(R.id.letra3)
        val letra4 : EditText = findViewById(R.id.letra4)

        var listaPalavraTentada1 = mutableListOf(letra0, letra1, letra2, letra3, letra4)

        // Tentativa linha 2
        val letra5 : EditText = findViewById(R.id.letra5)
        val letra6 : EditText = findViewById(R.id.letra6)
        val letra7 : EditText = findViewById(R.id.letra7)
        val letra8 : EditText = findViewById(R.id.letra8)
        val letra9 : EditText = findViewById(R.id.letra9)

        val listaPalavraTentada2 = mutableListOf<EditText>()

        listaPalavraTentada2.add(letra5)
        listaPalavraTentada2.add(letra6)
        listaPalavraTentada2.add(letra7)
        listaPalavraTentada2.add(letra8)
        listaPalavraTentada2.add(letra9)

        letra5.setEnabled(false);
        letra6.setEnabled(false);
        letra7.setEnabled(false);
        letra8.setEnabled(false);
        letra9.setEnabled(false);

        // Tentativa linha 3
        val letra10 : EditText = findViewById(R.id.letra10)
        val letra11 : EditText = findViewById(R.id.letra11)
        val letra12 : EditText = findViewById(R.id.letra12)
        val letra13 : EditText = findViewById(R.id.letra13)
        val letra14 : EditText = findViewById(R.id.letra14)

        val listaPalavraTentada3 = mutableListOf<EditText>()

        listaPalavraTentada3.add(letra10)
        listaPalavraTentada3.add(letra11)
        listaPalavraTentada3.add(letra12)
        listaPalavraTentada3.add(letra13)
        listaPalavraTentada3.add(letra14)

        letra10.setEnabled(false)
        letra11.setEnabled(false)
        letra12.setEnabled(false)
        letra13.setEnabled(false)
        letra14.setEnabled(false)

        // Tentativa linha 4
        val letra15 : EditText = findViewById(R.id.letra15)
        val letra16 : EditText = findViewById(R.id.letra16)
        val letra17 : EditText = findViewById(R.id.letra17)
        val letra18 : EditText = findViewById(R.id.letra18)
        val letra19 : EditText = findViewById(R.id.letra19)

        val listaPalavraTentada4 = mutableListOf<EditText>()

        listaPalavraTentada4.add(letra15)
        listaPalavraTentada4.add(letra16)
        listaPalavraTentada4.add(letra17)
        listaPalavraTentada4.add(letra18)
        listaPalavraTentada4.add(letra19)

        letra15.setEnabled(false)
        letra16.setEnabled(false)
        letra17.setEnabled(false)
        letra18.setEnabled(false)
        letra19.setEnabled(false)

        // Tentativa linha 5
        val letra20 : EditText = findViewById(R.id.letra20)
        val letra21 : EditText = findViewById(R.id.letra21)
        val letra22 : EditText = findViewById(R.id.letra22)
        val letra23 : EditText = findViewById(R.id.letra23)
        val letra24 : EditText = findViewById(R.id.letra24)

        val listaPalavraTentada5 = mutableListOf<EditText>()

        listaPalavraTentada5.add(letra20)
        listaPalavraTentada5.add(letra21)
        listaPalavraTentada5.add(letra22)
        listaPalavraTentada5.add(letra23)
        listaPalavraTentada5.add(letra24)

        letra20.setEnabled(false)
        letra21.setEnabled(false)
        letra22.setEnabled(false)
        letra23.setEnabled(false)
        letra24.setEnabled(false)

        // Tentativa linha 6
        val letra25 : EditText = findViewById(R.id.letra25)
        val letra26 : EditText = findViewById(R.id.letra26)
        val letra27 : EditText = findViewById(R.id.letra27)
        val letra28 : EditText = findViewById(R.id.letra28)
        val letra29 : EditText = findViewById(R.id.letra29)

        val listaPalavraTentada6 = mutableListOf<EditText>()

        listaPalavraTentada6.add(letra25)
        listaPalavraTentada6.add(letra26)
        listaPalavraTentada6.add(letra27)
        listaPalavraTentada6.add(letra28)
        listaPalavraTentada6.add(letra29)

        letra25.setEnabled(false)
        letra26.setEnabled(false)
        letra27.setEnabled(false)
        letra28.setEnabled(false)
        letra29.setEnabled(false)

        val bagOfWords = listOf("ALGOZ", "EXITO", "SAGAZ", "AMAGO", "MEXER", "SENSO", "AFETO", "SUTIL", "INATO", "CERNE", "MUTUO", "AUDAZ", "POREM", "TERMO", "NOBRE", "AQUEM", "IMPIO", "FAZER", "SECAO", "VIGOR", "LAPSO", "NEGRO",
            "IDEIA", "GENRO", "DESDE", "POSSE", "FUTIL", "ATROZ", "RAZAO", "TORPE", "EXPOR", "ANIMO", "HONRA", "DETEM", "ARDIL", "GLEBA", "ANSIA", "ETICA", "PODER", "AVIDO", "SANAR", "ATRAS", "PIFIO", "MUITO",
            "DIZER", "GESTO", "DIGNO", "CORJA", "JUSTO", "TENAZ", "CEDER", "ANEXO", "FUGAZ", "VIVAZ", "PORRA", "OBICE", "COZER", "COSER", "REVES", "ASSIM", "HABIL", "MORAL", "DEVER", "EBRIO", "COMUM", "AFAGO",
            "FLUIR", "VICIO", "CAUSA", "ONTEM", "CENSO", "REACA", "SERIO", "CITAR", "IMPOR", "SEARA", "ENFIM", "PROLE", "CISMA", "PUDOR", "NENEM", "BRADO", "ALIBI", "REGRA", "GERAR", "EGIDE", "OBTER", "LOUCO",
            "CRISE", "PESAR", "TENUE", "SABER", "PROBO", "TENRO", "PLENO", "ENTAO", "VIRIL", "OBVIO", "QUICA", "APICE", "PARVO", "BRUMA", "FAVOR", "VISAR", "TEMOR", "SINTO", "SABIO", "DENSO", "TANGE", "DESSE",
            "RETER", "JEITO", "HAVER", "SOBRE", "APRAZ", "SENIL", "SONHO", "SERIA", "LABOR", "FUSAO", "OBITO", "USURA", "CRIAR", "CULTO", "TEMER", "ROGAR", "MANSO", "AMENO", "EXODO", "ADIAR", "JUIZO", "PRESA",
            "REVEL", "FORMA", "CLAVA", "BIRRA", "PEDIR", "PROSA", "VACUO", "MUNDO", "DOGMA", "ESTAR", "FATOR", "TEMPO", "SERVO", "ARDUO", "FALAR", "VARAO", "FARSA", "MUTUA", "ACASO", "PULHA", "FORTE", "FALTA",
            "CUNHO", "AINDA", "EXATO", "GRATO", "ETNIA", "FLUXO", "AMPLO", "SAUDE", "ACHAR", "FEIXE", "GUISA", "ASSAZ", "MAGOA", "PARCO", "CACAR", "DOIDO", "PRUMO", "LAICO", "ATUAR", "FELIZ", "TOMAR", "RELES",
            "RITMO", "HEROI", "LAVRA", "PRAXE", "HASTE", "NOCAO", "VITAL", "CRUEL", "DEBIL", "DETER", "LEVAR", "AMIGO", "CASAL", "GOZAR", "GRACA", "MATIZ", "VISAO", "ANUIR", "CRIVO", "FINJO", "ALGUM", "DEVIR",
            "CHULO", "DUBIO", "BEATA", "ORDEM", "CERTO", "RIGOR", "SAIDA", "SESTA", "EPICO", "CASTA", "LEITO", "BRAVO", "CAPAZ", "VULTO", "LAMIA", "SALVO", "SULCO", "ACIMA", "RELVA", "VENIA", "MESMO", "DORSO",
            "POSSA", "CISAO", "VALHA", "UNICO", "PESTE", "VALOR", "FUGIR", "VASTO", "COISA", "VALIA", "TECER", "GARBO", "BANAL", "PUXAR", "SENDO", "DOCIL", "REGER", "FUROR", "POBRE", "ARIDO", "IGUAL", "MAIOR",
            "BREVE", "ATIVO", "OUVIR", "SENAO", "FALSO", "SELAR", "VELAR", "ANELO", "CASTO", "HORDA", "AUREO", "FITAR", "VIVER", "OLHAR", "BOCAL", "TOADA", "POMPA", "MORAR", "GERIR", "SUMIR", "COPIA", "VORAZ",
            "FACIL", "CABAL", "LEIGO", "MORTE", "TEDIO", "NOITE", "REMIR", "MOCAO", "HOMEM", "COESO", "UNIAO", "SEGUE", "PRECE", "AVIAO", "VIMOS", "COCAR", "VENDO", "TERNO", "CESTA", "TENDE", "VENAL", "ACESO",
            "PEIXE", "VAZIO", "CLARO", "SONSO", "PARDO", "MESMA", "FACAM", "MOTIM", "HIATO", "SERIE", "PAUTA", "PASSO", "BANDO", "VIRAO", "SENDA", "VELHO", "GRAVE", "OPCAO", "OTICA", "ANCIA", "REVER", "SARUE",
            "IMUNE", "HOUVE", "ARCAR", "HAVIA", "CAUDA", "PECHA", "BOTAR", "FIXAR", "POSSO", "LIAME", "AVARO", "FLORA", "COVIL", "FORCA", "FENDA", "FARDO", "POUCO", "GENTE", "PONTO", "JOVEM", "JAZIA", "QUOTA",
            "NODOA", "CAIXA", "SAIBA", "VETOR", "EXAME", "FOSSE", "FAUNA", "LUGAR", "FONTE", "CIOSO", "ADVEM", "PRAZO", "VEMOS", "VERBA", "ARDOR", "CIUME", "NICHO", "PRESO", "FEUDO", "OTIMO", "EPOCA", "JUNTO",
            "OPACO", "APOIO", "SOLTO", "DOIDO", "SOLDO", "PEGAR", "TENDO", "ASTRO", "SERAO", "CALMA", "CHEIO", "GLOSA", "ORFAO", "FICAR", "APEGO", "APELO", "CANSO", "LASSO", "FEITO", "ESTAO", "FATAL", "FOLGA",
            "OUTRO", "ASILO", "DERAM", "BATER", "CRIME", "SUPOR", "SIGNO", "FINDA", "PLANO", "FRACO", "TIRAR", "CARRO", "PAJEM", "SUCIA", "FICHA", "RESES", "IGNEO", "FOREM", "NAVIO", "BURRO", "AMBAS", "PARTE",
            "RUINA", "MUDAR", "OCASO", "MASSA", "CREDO", "BRISA", "ATRIO", "AONDE", "NACAO", "LEGAL", "XEQUE", "CACHO", "COVER", "CAMPO", "NIVEL", "SETOR", "IDEAL", "REZAR", "PLATO", "PAIRA", "LESSE", "OPTAR",
            "PRAGA", "GOLPE", "BICHO", "PLEBE", "TORSO", "INDIO", "TANTO", "PRAIA", "SINAL", "PASMO", "ABRIR", "FRUIR", "VENHO", "GENIO", "ICONE", "MESSE", "PERDA", "TROCA", "AGUDO", "FATEC", "AROMA", "RUBRO")

        var randomNum = (0..439).random()
        val palavraSecreta = bagOfWords[randomNum]

        val listaPalavraSecreta = mutableListOf<String>()
        for (i in 0 .. 4){
            listaPalavraSecreta.add(palavraSecreta[i].toString())
        }

        var tentativa = 1
        var letrasCertas = 0


        btnVerificarResposta.setOnClickListener {
            if (tentativa == 1) {
                for (i in 0..4) {
                    if (listaPalavraTentada1[i].text.toString() in listaPalavraSecreta && listaPalavraTentada1[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada1[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada1[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada1[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada1[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada1[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada1[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada1[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada1[i].setEnabled(false)
                    listaPalavraTentada2[i].setEnabled(true)
                }
            }
            if (tentativa == 2) {
                letrasCertas = 0
                for (i in 0..4) {
                    if (listaPalavraTentada2[i].text.toString() in listaPalavraSecreta && listaPalavraTentada2[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada2[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada2[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada2[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada2[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada2[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada2[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada2[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada2[i].setEnabled(false)
                    listaPalavraTentada3[i].setEnabled(true)
                }
            }
            if (tentativa == 3) {
                letrasCertas = 0
                for (i in 0..4) {
                    if (listaPalavraTentada3[i].text.toString() in listaPalavraSecreta && listaPalavraTentada3[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada3[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada3[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada3[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada3[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada3[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada3[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada3[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada3[i].setEnabled(false)
                    listaPalavraTentada4[i].setEnabled(true)
                }
            }
            if (tentativa == 4) {
                letrasCertas = 0
                for (i in 0..4) {
                    if (listaPalavraTentada4[i].text.toString() in listaPalavraSecreta && listaPalavraTentada4[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada4[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada4[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada4[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada4[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada4[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada4[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada4[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada4[i].setEnabled(false)
                    listaPalavraTentada5[i].setEnabled(true)
                }
            }
            if (tentativa == 5) {
                letrasCertas = 0
                for (i in 0..4) {
                    if (listaPalavraTentada5[i].text.toString() in listaPalavraSecreta && listaPalavraTentada5[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada5[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada5[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada5[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada5[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada5[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada5[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada5[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada5[i].setEnabled(false)
                    listaPalavraTentada6[i].setEnabled(true)
                }
            }
            if (tentativa == 6) {
                letrasCertas = 0
                for (i in 0..4) {
                    if (listaPalavraTentada6[i].text.toString() in listaPalavraSecreta && listaPalavraTentada6[i].text.toString() == listaPalavraSecreta[i]) {
                        listaPalavraTentada6[i].setBackgroundColor(Color.parseColor("#06942E"))
                        listaPalavraTentada6[i].setTextColor(Color.parseColor("#EDEDED"))
                        letrasCertas += 1
                    } else if (listaPalavraTentada6[i].text.toString() in listaPalavraSecreta) {
                        listaPalavraTentada6[i].setBackgroundColor(Color.parseColor("#FFB300"))
                        listaPalavraTentada6[i].setTextColor(Color.parseColor("#EDEDED"))
                    } else {
                        listaPalavraTentada6[i].setBackgroundColor(Color.parseColor("#E53935"))
                        listaPalavraTentada6[i].setTextColor(Color.parseColor("#EDEDED"))
                    }
                    listaPalavraTentada6[i].setEnabled(false)
                }
            }
            tentativa += 1

            if (validarVitoria(letrasCertas)) {
                Toast.makeText(this, "EXCELSIOR!", Toast.LENGTH_LONG).show()
                btnVerificarResposta.isClickable = false

                val actualStats = db.dao().getStatsById()
                if (actualStats.isNullOrEmpty()){
                    db.dao().insertStats(Stats(1, 1, 1, 1, 1))
                }else {
                    var carrerHigh = actualStats[0].carrerHigh.toString().toInt()
                    var gamesPlayed = actualStats[0].gamesPlayed.toString().toInt()
                    var gamesWon = actualStats[0].gamesWon.toString().toInt()
                    var streak = actualStats[0].streak.toString().toInt()

                    gamesPlayed+= 1
                    gamesWon += 1
                    streak += 1

                    if (streak > carrerHigh){
                        carrerHigh = streak
                    }

                    db.dao().setStats(Stats(1, carrerHigh, gamesPlayed, gamesWon, streak))
                }
            }

            if (tentativa == 7 && !validarVitoria((letrasCertas))){
                val actualStats = db.dao().getStatsById()
                if (actualStats.isNullOrEmpty()){
                    db.dao().insertStats(Stats(1, 0, 1, 0, 0))
                }else {
                    var carrerHigh = actualStats[0].carrerHigh.toString().toInt()
                    var gamesPlayed = actualStats[0].gamesPlayed.toString().toInt()
                    var gamesWon = actualStats[0].gamesWon.toString().toInt()
                    var streak = actualStats[0].streak.toString().toInt()

                    gamesPlayed += 1

                    db.dao().setStats(Stats(1, carrerHigh, gamesPlayed, gamesWon, 0))
                }

                Toast.makeText(this, "NÃO FOI DESSA VEZ! TENTE NOVAMENTE!", Toast.LENGTH_LONG).show()
                btnVerificarResposta.isClickable = false
                txtFATECO.textSize = 33f
                txtFATECO.text = "A palavra era ${palavraSecreta}."

            }
        }
    }

    fun validarVitoria (acertos : Int) : Boolean{
        if (acertos == 5){
            return true
        }
        return false
    }
}