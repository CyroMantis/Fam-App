package QualityResponAppFAM.Model.HasilProsesModel;

/**
 *
 * @author qifli
 */
public class HasilProses {

    private String prosesnama;
    private String prosesnim;
    private double proseshasil;
    private String proseskeputusan;

    public HasilProses() {

    }

    public HasilProses(String prosesnim, String prosesnama, double proseshasil, String proseskeputusan) {
        this.prosesnim = prosesnim;
        this.prosesnama = prosesnama;
        this.proseshasil = proseshasil;
        this.proseskeputusan = proseskeputusan;
    }

    public String getprosesnama() {
        return prosesnama;
    }

    public void setprosesnama(String prosesnama) {
        this.prosesnama = prosesnama;
    }

    public String getproseskeputusan() {
        return proseskeputusan;
    }

    public void setproseskeputusan(String proseskeputusan) {
        this.proseskeputusan = proseskeputusan;
    }

    public String getprosesnim() {
        return prosesnim;
    }

    public void setprosesnim(String prosesnim) {
        this.prosesnim = prosesnim;
    }

    public double getprosesHasil() {
        return proseshasil;
    }

    public void setProsesHasil(double proseshasil) {
        this.proseshasil = proseshasil;
    }

}
