/* helloworld
 *
 * output simple hello message
 *
 */

 int n=0;

void setup() {
  Serial.begin(9600);
  Serial.println("Hello, world!");
}

void loop() {
  
  delay(1000);
  n = n+1;
  Serial.println( n + "sec have elapsed");
}
