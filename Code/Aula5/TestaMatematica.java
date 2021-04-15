public class TestaMatematica {
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        mat.setx(5.0);
        mat.sety(5.0);
        mat.setz(5.0);
        mat.setxx(5.0);
        mat.setyy(5.0);
        Integer quantifi = 2;
        //String seletor = "add";
        //String seletor = "sub";
        //String seletor = "mult";
        //String seletor = "div";
        String seletor = "pot";
        switch (quantifi) {
            case 2:
                if (seletor == "add") {
                    System.out.println(mat.add(mat.getx(),mat.gety()));
                }
                if(seletor == "sub"){
                    System.out.println(mat.sub(mat.getx(),mat.gety()));
                }
                if(seletor == "mult"){
                    System.out.println(mat.mult(mat.getx(),mat.gety()));
                }
                if(seletor == "div"){
                    System.out.println(mat.div(mat.getx(),mat.gety()));
                }
                if(seletor == "pot"){
                    System.out.println(mat.pot(mat.getx(),mat.gety()));
                }
                break;
                case 3:
                 if (seletor == "add") {
                    System.out.println(mat.add3(mat.getx(),mat.gety(),mat.getz()));
                }
                if(seletor == "sub"){
                    System.out.println(mat.sub3(mat.getx(),mat.gety(),mat.getz()));
                }
                if(seletor == "mult"){
                    System.out.println(mat.mult3(mat.getx(),mat.gety(),mat.getz()));
                }
                if(seletor == "div"){
                    System.out.println(mat.div3(mat.getx(),mat.gety(),mat.getz()));
                }
                if(seletor == "pot"){
                    System.out.println(mat.pot3(mat.getx(),mat.gety(),mat.getz()));
                }
                break;
                case 4:
                 if (seletor == "add") {
                    System.out.println(mat.add4(mat.getx(),mat.gety(),mat.getz(),mat.getxx()));
                }
                if(seletor == "sub"){
                    System.out.println(mat.sub4(mat.getx(),mat.gety(),mat.getz(),mat.getxx()));
                }
                if(seletor == "mult"){
                    System.out.println(mat.mult4(mat.getx(),mat.gety(),mat.getz(),mat.getxx()));
                }
                if(seletor == "div"){
                    System.out.println(mat.div4(mat.getx(),mat.gety(),mat.getz(),mat.getxx()));
                }
                if(seletor == "pot"){
                    System.out.println(mat.pot4(mat.getx(),mat.gety(),mat.getz(),mat.getxx()));
                }
                break;
                case 5:
                 if (seletor == "add") {
                    System.out.println(mat.add5(mat.getx(),mat.gety(),mat.getz(),mat.getxx(),mat.getyy()));
                }
                if(seletor == "sub"){
                    System.out.println(mat.sub5(mat.getx(),mat.gety(),mat.getz(),mat.getxx(),mat.getyy()));
                }
                if(seletor == "mult"){
                    System.out.println(mat.mult5(mat.getx(),mat.gety(),mat.getz(),mat.getxx(),mat.getyy()));
                }
                if(seletor == "div"){
                    System.out.println(mat.div5(mat.getx(),mat.gety(),mat.getz(),mat.getxx(),mat.getyy()));
                }
                if(seletor == "pot"){
                    System.out.println(mat.pot5(mat.getx(),mat.gety(),mat.getz(),mat.getxx(),mat.getyy()));
                }
                break;
            default:
                System.out.println("o sistema falhou!");
                break;
        }
    }
}
