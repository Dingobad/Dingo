class ScopeDemo
{
    public static void main(String[] args) {
        int х;
        х = 10;
        if(х == 10) 
        {
            int у = 20;
            System.out.println("х и у: " + х + " " + у);
            х = у * 2;
        }
        System.out.println("Значение х равно " + х);
    }
}
