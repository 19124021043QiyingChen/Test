package assesment2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Journey {
	private String Route;//Route Point
	private int adultPrice;//adult 
	private int concessionPrice;//discount
	private int duration;//���е�ʱ��
	private int passengersNumber=0;//������������,���Ϊ20��
	private boolean journeyFlag=false;//��������״̬,δ����Ϊfalse,����Ϊtrue
	private Passengers[] passengers=new Passengers[20];//����ÿ͵�����
	private Map<Passengers,String> passengersPalyFalg=new HashMap<Passengers, String>();//�ÿ͸�����,��������Ϊtrue,δ������Ϊfalse;һ���ÿͶ�һ�����
	public Journey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Journey(String route, int adultPrice, int concessionPrice, int duration) {
		super();
		Route = route;
		this.adultPrice = adultPrice;
		this.concessionPrice = concessionPrice;
		this.duration = duration;
	}

	public String getRoute() {
		return Route;
	}
	public void setRoute(String route) {
		Route = route;
	}
	public int getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}
	public int getConcessionPrice() {
		return concessionPrice;
	}
	public void setConcessionPrice(int concessionPrice) {
		this.concessionPrice = concessionPrice;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getPassengersNumber() {
		return passengersNumber;
	}
	public void setPassengersNumber(int passengersNumber) {
		this.passengersNumber = passengersNumber;
	}
	public Passengers[] getPassengers() {
		return passengers;
	}
	public void setPassengers(Passengers[] passengers) {
		this.passengers = passengers;
	}
	
	public HashMap<Passengers, String> getPassengersPalyFalg() {
		return (HashMap<Passengers, String>) passengersPalyFalg;
	}
	public boolean getJourneyFlag() {
		return journeyFlag;
	}
	public void setJourneyFlag(boolean journeyFlag) {
		this.journeyFlag = journeyFlag;
	}
	/**
	 * ���ó˿͸���״̬
	 * @param passengers �˿�
	 * @return ����״̬��ֵ��
	 */
	public String setPassengersPalyFalg(Passengers passengers,String paly) {
		if (journeyFlag) {
			System.out.println("����;�ѳ���!�����޸ĸ���״̬!");
			return passengersPalyFalg.put(passengers, "δ����");
		}else if(paly.equals("δ����")){
			System.out.println("����;�ѳ���!���ɸ���");
			return passengersPalyFalg.put(passengers, "δ����");
		}
		System.out.println("ȷ�ϳɹ�!�ó˿��Ѹ���!");
		return passengersPalyFalg.put(passengers, paly);
		
	}
	/**
	 * �����û�����,�õ��û�������Ϣ
	 * @param passengers �û�
	 * @return �����û�������Ϣ
	 */
	public String getPassengersPalyFalg(Passengers passengers) {
		return passengersPalyFalg.get(passengers);
	}
	/**
	 * �����û�����;��,����Ϊδ����״̬,����������20ʱ����;����ʱ���������ӳ˿�
	 * @param passengers ��Ҫ���ӵ���;�ĳ˿�
	 */
	public void setPassengers(Passengers passengers) {
		//�ж�����.����20ʱ��������
		if (passengersNumber>19) {
			System.out.println("����;����20��!��ѡ��������;!");
			return;
		}else if (journeyFlag) {
			System.out.println("����;�ѳ���!�������ӳ˿�!");
			return;
		}
		this.passengers[passengersNumber]= passengers;//��һ�����������0λ,passengersNumberΪ����,��Ӧλ����Ϣ
		passengersPalyFalg.put(this.passengers[passengersNumber], "δ����");//����δ������
		passengersNumber++;//������1
	}
	@Override
	public String toString() {
		return "Journey [Route=" + Route + ", adultPrice=" + adultPrice + ", concessionPrice=" + concessionPrice
				+ ", duration=" + duration + ", passengersNumber=" + passengersNumber + ", passengers="
				+ Arrays.toString(passengers) + ", passengersPalyFalg=" + passengersPalyFalg + "]";
	}
	
}