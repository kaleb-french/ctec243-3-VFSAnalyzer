import java.util.ArrayList;

public class Folder implements FileSystemItem{
    private String name;
    private ArrayList<FileSystemItem> items;
    Folder(String name){
        this.name = name;
        items = new ArrayList<>();
    }
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSizeInKB() {
		return 0;
	}
	public void addItem(FileSystemItem item){
	    items.add(item);
	}
	public ArrayList<FileSystemItem> getItems(){
	    return this.items;
	}

}
