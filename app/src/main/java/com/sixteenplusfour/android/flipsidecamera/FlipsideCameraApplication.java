import android.content.
        res.AssetManager;
import android.content.res.Resources;

public class Test1 {
    public static void testImport(Resources resources) {
        AssetManager assets = resources.getAssets();
        String[] locales = assets.getLocales();
    }
}

public class Test2 {
    public static void testBlock(Resources resources) {
        AssetManager assets = resources.getAssets();
    String[] locales = assets.getLocales();
    }
}

public class Test3 {
    public static void testName(Resources resources) {
        String kName = "123";
        String bname = "a";
        String k_name = "b";
    }
    public void testComment() {
    String a = "a";
    // String b = "b";
}

 public int sub(int var1, int var2, int var3, int var4, int var5, int var6) {
    return var1-var2-var3-var4-var5-var6;
}
}
