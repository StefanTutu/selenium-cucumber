class XYZ {
    private  void showing() {
        System.out.println("Test X-Y-Z");
    }

    public void main(String[] args) {
        showing();
    }
}

class ABC {

    public static void main(String args[]) {

        XYZ obj = new XYZ();
        // Trying to access private method
        // of another class
        //obj.showing();
    }
}

///makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"
// makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"
//public String makeTags(String tag, String word) {
//    return "<" + tag + ">" + word + "</" + tag + ">";
//}
