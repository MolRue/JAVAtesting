package ch07MartRemind;

import java.util.ArrayList;

public class CustomerApplication {
	
	private static ArrayList<Customer> customerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//고객명단
		//Silver
		Customer costomer001 = new Customer(10010, "고철수");
		Customer costomer002 = new Customer(10020, "고영희");
		//Gold
		Customer costomer003 = new GoldCustomer(10030, "고길동");
		Customer costomer004 = new GoldCustomer(10040, "고희동");
		//Vip
		Customer costomer005 = new VipCustomer(10050, "둘리", 11333);
		Customer costomer006 = new VipCustomer(10060, "도우너", 11325);
		
		customerList.add(costomer001);
		customerList.add(costomer002);
		customerList.add(costomer003);
		customerList.add(costomer004);
		customerList.add(costomer005);
		customerList.add(costomer006);
		
		showAllCustomer();
		
		Customer customer = findCustomer(10060);
		
		if (customer == null) {
			System.out.println("존재하지 않는 회원");
		} else {
			showPriceBonus(customer, 100000);
		}
	}
	
		public static void showAllCustomer() {
			System.out.println("==============모든 고객 정보 출력=============");
			for (Customer customer : customerList) {
				System.out.println(customer.showCustomerInfo());
			}			
		}
		public static Customer findCustomer(int customerID) {
			Customer resultCustomer = null;
			
			for (Customer customer : customerList) {
//			for (int i = 0; i < customerList.size() ; i++ ) {
				
				if (customer.getCustomerID() == customerID) {
					resultCustomer = customer;
					break;
				}
			}
			return resultCustomer;
		}
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("===================해당고객의 할인율과 보너스 포인트 계산============");
		int cost = customer.calcPrice(price);
		System.out.println(customer.getCustomerName()+"님의 지불금액 : " + cost + "원");
		System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트 : " + customer.bonusPoint + "점");
	}
}	
