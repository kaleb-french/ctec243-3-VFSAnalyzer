import java.util.Stack;

public class FileSystemAnalyzer {
    public static int countFilesRecursive(FileSystemItem item){
        if (item instanceof FileItem) {
            return 1;
        }
        Folder folder = (Folder) item;
        int count = 0;

        for (FileSystemItem file : folder.getItems()) {
            count += countFilesRecursive(file);
        }
        return count;
    }
   public static int calculateTotalSizeRecursive(FileSystemItem item){
       if (item instanceof FileItem) {
           return item.getSizeInKB();
       }
       Folder folder = (Folder) item;
       int size = 0;
       for (FileSystemItem file : folder.getItems()) {
           size += calculateTotalSizeRecursive(file);
       }
       return size;
   }
   public static FileItem findLargestFileRecursive(FileSystemItem item){
       if (item instanceof FileItem) {
           return (FileItem) item;
       }
       Folder folder = (Folder) item;
       FileItem largest = null;
       for (FileSystemItem file : folder.getItems()) {
           FileItem temp = findLargestFileRecursive(file);

           if (largest == null || temp.getSizeInKB() > largest.getSizeInKB()) {
                       largest = temp;
            }
       }
       return largest;
   }
   public static int countFilesIterative(Folder rootFolder) {
       Stack<FileSystemItem> stack = new Stack<>();
       int fileCount = 0;

       stack.push(rootFolder);

       while(!stack.isEmpty()){
           FileSystemItem item = stack.pop();
           if(item instanceof FileItem){
               fileCount++;
           }else{
               Folder folder = (Folder) item;
               for (FileSystemItem file : folder.getItems()) {
                   stack.push(file);
               }
           }
       }
       return fileCount;
   }
}
