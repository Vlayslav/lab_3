/*
Проаналізувати стрічку-речення, яка введена з клавіатури і здійснити перестановку в оберненому порядку слів.
 */

void main() {
    System.out.print("Enter val: ");
    Scanner sc = new Scanner(System.in);
    String strVal = sc.nextLine();
    char[] arrVal = strVal.toCharArray();

    String invertVal = "";

    for (int i=arrVal.length-1; i>=0; i=i-1) {
        //IO.println(arrVal[i]);
        invertVal+=arrVal[i];
    }
    System.out.println("звороотній ряд: "+invertVal);

    /*
    Додаток
    З клавіатури вводиться текстовий рядок. Скласти програму, яка підраховує кількість розділових знаків у тексті;
    виводить всі слова, що мають парну кількість літер; міняє місцями першу і останню літери кожного слова.
     */

    System.out.print("\nEnter val: ");
    Scanner sc2 = new Scanner(System.in);
    String text = sc2.nextLine();

    String cleanText = text.replaceAll("\\W", " ").replaceAll("\\d", "")
            .replaceAll("\\s+", " ");
    String dirtyText = text.replaceAll("\\w", "").replaceAll("\\s+", "");

    //виведення
    System.out.println("розділових знаків: "+dirtyText.length());

    System.out.println("парна к-сть літер: ");
    String tempWord="";
    for (char element:cleanText.toCharArray()){
        if (element!=' ') tempWord+=element;
        else if(tempWord.toCharArray().length%2==0){
            System.out.println("\t"+tempWord+" - "+tempWord.toCharArray().length);
            tempWord="";
        }else tempWord="";}

    System.out.println("переміщені літери слів: ");
    String fullWord="";
    for (char element:cleanText.toCharArray()){
        if (element!=' ') fullWord += element;
        if (element==' ' && fullWord!=""){
            char[] wordArr = fullWord.toCharArray();
            char firstLetter = wordArr[0];
            wordArr[0]=wordArr[wordArr.length-1];
            wordArr[wordArr.length-1]=firstLetter;
            System.out.println("\t"+ String.valueOf(wordArr));
            fullWord="";}}

    System.out.println("cleanText: |"+cleanText+"|");
    System.out.println("dirtyText: |"+dirtyText+"|");
}
