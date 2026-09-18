public class FileItem implements FileSystemItem{
    //a
    private String name;
    private int sizeInKB;
    //c
    FileItem(String name, int sizeInKB){
        this.name = name;
        this.sizeInKB = sizeInKB;
    }
    //m
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSizeInKB() {
		return sizeInKB;
	}


}
