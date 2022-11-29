package CH12.Generic;

public class Product<K, M> { // K,M : 타입 파라메터 정의.
	//필드
	private K kind; //아직은 어떤 타입이(String?Integer?) 이 올지 모른다.
	private M model;
	
	// getter , setter 메소드
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	
}
