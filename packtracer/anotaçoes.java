/**
  Hello world
  @author  kaio e camila 

*/
// executar uma vez
void setup() {
  pinMode(13, OUTPUT);
}
// executar em loop infinito
void loop() {
  digitalWrite(13, HIGH);
  delay(1000); //1000=1s
  digitalWrite(13, LOW) ;
  delay(1000);
}

Aula 1




aula 2 


fundamentos da progamacao com arduino 
@author kaio eduardo 
*/

// Variaveis (declaracoes)
int valorSensor;             //numemeros inteiros
float temperatura, unidade;  // nm inteiros e nao inteiros
char tecla;                  // 1 caractere
String placa;                //sequencia de caracteres
bool gameOver;               // true ou false




void setup() {
  valorSensor = 100;
  temperatura = 31.6;
  tecla = 'W';
  placa = "arduino UNO R3";
  gameOver = true;
  Serial.begin(9600);  // inicializar a  comunicacao serial (9600 bites por second)
  Serial.println("Hello world");
  Serial.println("Estudo das variaveis");
  Serial.print("Valor do sensor: ");
  Serial.println(valorSensor);
  Serial.print("Temperatura: ");
  Serial.println(temperatura);
  Serial.print("Tecla pressionada: ");
  Serial.println(tecla);
  Serial.print("Placa: ");
  Serial.println(placa);
  Serial.print("Game Over:(0: false 1: true) ");
  Serial.println(gameOver);
}

void loop() {
}




aula 3 

/**
 Acionamento com 1 botao 

@author kaio 
*/

void setup() {
  pinMode(3, INPUT_PULLUP);
  pinMode(13, OUTPUT);
}

void loop() {

  // estrutura condicional do tipo se - senao
  int sw1 = digitalRead(3);
  if (sw1 == 0) {
    digitalWrite(13, HIGH);
  } else {
    digitalWrite(13, LOW);
  }
}

**
acionamento de um led com dois botoes 
@author kaio  
*/

void setup() {
  pinMode(2, INPUT_PULLUP);  // entrada com o uso do resistor interno
  pinMode(3, INPUT_PULLUP);
  pinMode(13, OUTPUT);
  Serial.begin(9600);
}

void loop() {

  int sw1 = digitalRead(3);  //criar variavel do tipo inteiro que recebe o valor do pino 3
  int sw2 = digitalRead(2);
  Serial.print("sw1: ");
  Serial.print(sw1);
  Serial.print(" | ");
  Serial.print("sw2: ");
  Serial.println(sw2);
  // estrutura de controle convecional
  // se botao pressionado
  if (sw1 == 0) {
    digitalWrite(13, HIGH);
  }

  // estrutura de controle convecional
  // se botao pressionado
  if (sw2 == 0) {
    digitalWrite(13, LOW);
  }
} 

  void setup() {
  pinMode(2, INPUT_PULLUP);
  pinMode(3, INPUT_PULLUP); 
  pinMode(13, OUTPUT);
}

 

void loop() { //estrutura condicional do tipo 
  int sw1 = digitalRead(3);
  int sw2 = digitalRead(2);
  if (sw1 == 0  && sw2 == 0) {
  digitalWrite(13, HIGH);
  } 
  else {
    digitalWrite(13, LOW);
}
}

escada rolante 


// SIMULDOR DE BOTOES DE PARADADE EMERGENCIA DE ESCADA ROLANTE
//
void setup() {
  pinMode(13, OUTPUT);
  pinMode(2, INPUT_PULLUP);
  pinMode(3, INPUT_PULLUP);
  digitalWrite(13, HIGH);
}



void loop() {
  int sw1 = digitalRead(2);
  int sw2 = digitalRead(3);
  if (sw1 == 0 || sw2 == 0) {  //essas coisa ai || e ou
    digitalWrite(13, LOW);
  }
}



cmd not 


void setup() {
  pinMode(2, INPUT_PULLUP);

  pinMode(13, OUTPUT);
}



void loop() {
  int sw1 = digitalRead(2);

  if (sw1 == 0) {
    digitalWrite(13, !digitalRead(13));  // ! inverte a logica
  }
  delay(200);  // minimizar o daly 
}










AULA 5 


/**
Leitura de um sensor de luminosidade (fotoresistor - LDR)
@author kaio 
*/

void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);
}



void loop() {
  int sensorLDR = analogRead(A0);
  Serial.print("Valor do sensor: ");
  Serial.println(sensorLDR);
  delay(100);
  if (sensorLDR >= 700) {
    digitalWrite(13, LOW);
  } else {
    digitalWrite(13, HIGH);
  }
}






























/**
fundamentos da progamaçao com arduino 
@author kaio eduardo 
*/ 

void setup() {
  Serial.begin(9600); //*inicializar a  comunicaçao serial 
  

}

void loop() {
  Serial.println("Hello World");
  
Aula 2



