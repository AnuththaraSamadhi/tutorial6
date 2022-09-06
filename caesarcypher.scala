object CeasarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val shift = (scala.io.StdIn.readLine("Shift number: ").toInt + alphabet.size) % alphabet.size

  val inputText = scala.io.StdIn.readLine("Enter the code to encrypt or decrypt: ")


  val Encryption = (shift: Int) => inputText.map((c: Char) => {

    val x = alphabet.indexOf(c.toUpper)

    if (x == -1) c

    else alphabet((x + shift + alphabet.size) % alphabet.size)
  });


  val Dycryption = (shift: Int) => inputText.map((c: Char) => {

    val x = alphabet.indexOf(c.toUpper)

    if (x == -1) c

    else alphabet((x - shift + alphabet.size) % alphabet.size)
  });


  println("Press 1 to encrypt");
  println("Press 2 to decrypt");
  val n = scala.io.StdIn.readInt()

  if (n == 1) println("Encrypted message: " + Encryption(shift))

  else println("Decrypted message: " + Dycryption(shift))
}
