public class Main {
    static void main() {
        Folder root = new Folder("root");
        Folder documents = new Folder("Documents");
        Folder pictures = new Folder("Pictures");
        Folder cameraRoll = new Folder("Camera Roll");

        FileSystemItem beachPic = new FileItem("Beach Picture", 1285);
        FileSystemItem selfie = new FileItem("Selfie", 1538);
        FileSystemItem dogPic = new FileItem("Dog Picture", 1337);

        cameraRoll.addItem(beachPic);
        cameraRoll.addItem(selfie);
        cameraRoll.addItem(dogPic);
        pictures.addItem(cameraRoll);

        root.addItem(documents);
        root.addItem(pictures);

        System.out.println(FileSystemAnalyzer.countFilesRecursive(root));
        System.out.println(FileSystemAnalyzer.countFilesIterative(root));

    }
}
