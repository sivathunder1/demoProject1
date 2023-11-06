package java.feq.questions;

class Findrepeater_16{
	public static void Findrepeter(String input){
		String s=input;
		int distinct = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					distinct++;
				}
			}
			System.out.println(s.charAt(i)+"--"+distinct);
			String d=String.valueOf(s.charAt(i)).trim();
			s=s.replaceAll(d,"");
			distinct = 0;
		}
	}
	public static void main(String[] args) {
		Findrepeter("Lala Land");
	}
}