package net.javaguides.peptides_backend.dto;



import java.math.BigDecimal;

public class peptideDto {
    private String entry;

    private String accession;

    private String description;

    private BigDecimal score;

    private BigDecimal falsePositiveRate;

    private BigDecimal avgMass;

    private String peptideModification;

    private BigDecimal peptideMhp;

    private String peptideSeq;

    private Integer peptideSeqStart;

    private Integer peptideSeqLength;

    private String peptideMatchedProducts;

    private BigDecimal precursorRetentionTime;

    private Integer precursorIntensity;

    private Integer precursorCharge;

    private BigDecimal precursorMz;

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getFalsePositiveRate() {
        return falsePositiveRate;
    }

    public void setFalsePositiveRate(BigDecimal falsePositiveRate) {
        this.falsePositiveRate = falsePositiveRate;
    }

    public BigDecimal getAvgMass() {
        return avgMass;
    }

    public void setAvgMass(BigDecimal avgMass) {
        this.avgMass = avgMass;
    }

    public String getPeptideModification() {
        return peptideModification;
    }

    public void setPeptideModification(String peptideModification) {
        this.peptideModification = peptideModification;
    }

    public BigDecimal getPeptideMhp() {
        return peptideMhp;
    }

    public void setPeptideMhp(BigDecimal peptideMhp) {
        this.peptideMhp = peptideMhp;
    }

    public String getPeptideSeq() {
        return peptideSeq;
    }

    public void setPeptideSeq(String peptideSeq) {
        this.peptideSeq = peptideSeq;
    }

    public Integer getPeptideSeqStart() {
        return peptideSeqStart;
    }

    public void setPeptideSeqStart(Integer peptideSeqStart) {
        this.peptideSeqStart = peptideSeqStart;
    }

    public Integer getPeptideSeqLength() {
        return peptideSeqLength;
    }

    public void setPeptideSeqLength(Integer peptideSeqLength) {
        this.peptideSeqLength = peptideSeqLength;
    }

    public String getPeptideMatchedProducts() {
        return peptideMatchedProducts;
    }

    public void setPeptideMatchedProducts(String peptideMatchedProducts) {
        this.peptideMatchedProducts = peptideMatchedProducts;
    }

    public BigDecimal getPrecursorRetentionTime() {
        return precursorRetentionTime;
    }

    public void setPrecursorRetentionTime(BigDecimal precursorRetentionTime) {
        this.precursorRetentionTime = precursorRetentionTime;
    }

    public Integer getPrecursorIntensity() {
        return precursorIntensity;
    }

    public void setPrecursorIntensity(Integer precursorIntensity) {
        this.precursorIntensity = precursorIntensity;
    }

    public Integer getPrecursorCharge() {
        return precursorCharge;
    }

    public void setPrecursorCharge(Integer precursorCharge) {
        this.precursorCharge = precursorCharge;
    }

    public BigDecimal getPrecursorMz() {
        return precursorMz;
    }

    public void setPrecursorMz(BigDecimal precursorMz) {
        this.precursorMz = precursorMz;
    }

    public peptideDto(String entry, String accession, String description, BigDecimal score, BigDecimal falsePositiveRate, BigDecimal avgMass, String peptideModification, BigDecimal peptideMhp, String peptideSeq, Integer peptideSeqStart, Integer peptideSeqLength, String peptideMatchedProducts, BigDecimal precursorRetentionTime, Integer precursorIntensity, Integer precursorCharge, BigDecimal precursorMz) {
        this.entry = entry;
        this.accession = accession;
        this.description = description;
        this.score = score;
        this.falsePositiveRate = falsePositiveRate;
        this.avgMass = avgMass;
        this.peptideModification = peptideModification;
        this.peptideMhp = peptideMhp;
        this.peptideSeq = peptideSeq;
        this.peptideSeqStart = peptideSeqStart;
        this.peptideSeqLength = peptideSeqLength;
        this.peptideMatchedProducts = peptideMatchedProducts;
        this.precursorRetentionTime = precursorRetentionTime;
        this.precursorIntensity = precursorIntensity;
        this.precursorCharge = precursorCharge;
        this.precursorMz = precursorMz;
    }
}
