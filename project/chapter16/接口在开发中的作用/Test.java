Public class Test
{
	public static void main(String[] args){
	//������ʦ����
	FoodMenu cooker1 = new chinaCooker();

	//�����˿Ͷ���
	Customer customer = new Customer(cooker1);

	//�˿͵��
	customer.order();
	}
}