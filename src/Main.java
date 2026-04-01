/*
Проаналізувати стрічку-речення, яка введена з клавіатури і здійснити перестановку в оберненому порядку слів.
 */

void main() {
    System.out.print("Enter val: ");
    Scanner sc = new Scanner(System.in);
    String strVal = sc.next();
    char[] arrVal = strVal.toCharArray();

    String invertVal = "";

    for (int i=arrVal.length-1; i>=0; i=i-1) {
        //IO.println(arrVal[i]);
        invertVal+=arrVal[i];
    }
    System.out.println("звороотній ряд: "+invertVal);
}
