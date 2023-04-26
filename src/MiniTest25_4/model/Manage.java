package MiniTest25_4.model;

public interface Manage<E> {
//    + Tạo 1 đối tượng, trả về đối tượng vừa tạo
//	+ Sửa 1 đối tượng, trả về đối tượng vừa sửa
//	+ Xóa 1 đối tượng, trả về đối tượng vừa xóa
//	+ Lấy ra 1 đối tượng, trả về đối tượng vừa tìm thấy
//	+ Hiển thị tất cả đối tượng, void method
E create();

    E update();

    E delete();

    E getById();

    void displayAll();

}
