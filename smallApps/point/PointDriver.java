package smallApps.point;

public class PointDriver {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3);
        Point2d p3 = new Point2d();
        Point2d p4 = new Point2d(3,3);
        Point3d p5 = new Point3d();
        Point3d p6 = new Point3d(4,4,4);

        doShowPoint(p1);
        doShowPoint(p2);
        doShowPoint(p3);
        doShowPoint(p4);
        doShowPoint(p5);
        doShowPoint(p6);

//        System.out.print("p1-->point");
//        p1.showPoint();
//        System.out.println("\n");
//
//        System.out.print("p1-->point2d -subtyping");
//        p1 =  new Point2d(); // pragmatikos typos Point2d -typos anaforas point
//                             // epomenos me thn p1 kalo mono methods poy anhkoyn sthn point
//        p1.showPoint();      // ostoso me th showPoint ginetai downcast kai kaleitai h teleytaia ekdosh
//                             // dhladh ayth ths point2d
//
//        System.out.println("\n");
//
//        System.out.print("p1-->point3d -subtyping");
//        p1 =  new Point3d(); // pragmatikos typos Point3d -typos anaforas point
//                             // epomenos me thn p1 kalo mono methods poy anhkoyn sthn point
//        p1.showPoint();      // ostoso me th showPoint ginetai downcast kai kaleitai h teleytaia ekdosh
//                             // dhladh ayth ths point3d
//
//        p1.showPoint();
//        p2.showPoint();
//        p3.showPoint();
//        p4.showPoint();
//        p5.showPoint();
//        p6.showPoint();

    }
    // epidei h parametros p ths doShowPoint mporei na parei polles morfes
    // onomazetai poloymorfikh kai h methodos polumorfikh methodos
    // mesa sto soma ths doShowPoint kaloume thn p.showPoint kai etsi kaleita
    //ekeinh h showPoint analoga ti antikeimeno pernaei sthn thesh toy p
    //an peraso to p1,p2 kaleitai h Point
    //an peraso to p3,p4 kaleitai h point2d
    //an peraso to p5,p6 kaleitai h point3d
    // h idiothta ayth legetai katysterhmenh desmeysh late binding
    // dioti h epilogh ths showPoint() ginetai kata thn ektelesh kai oxi to compile
    
    private static void doShowPoint(Point p) {
        p.showPoint();

    }
}
