package org.ekstep.ipa.util.preference;

import org.ekstep.genie.util.preference.PreferenceUtil;

/**
 * Created by vinayagasundar on 3/11/17.
 */

public final class PartnerPrefUtil {

    /**
     * Get Google account id
     *
     * @return Google account id or null
     */
    public static String getGoogleAccount() {
        return PreferenceUtil.getPreferenceWrapper()
                .getString(PartnerPrefKey.KEY_GOOGLE_ACCOUNT, null);
    }

    /**
     * Set Google Account Id;
     *
     * @param accountName account id
     */
    public static void setGoogleAccount(String accountName) {
        PreferenceUtil.getPreferenceWrapper()
                .putString(PartnerPrefKey.KEY_GOOGLE_ACCOUNT, accountName);
    }

    /**
     * Get the last time Partner Apps Synced
     *
     * @return time of the Partner data synced
     */
    public static long getPartnerDataSynced() {
        return PreferenceUtil.getPreferenceWrapper().getLong(PartnerPrefKey.KEY_PARTNER_DATA_SYNC, -1);
    }

    /**
     * Set the last time Partner Apps Synced time
     *
     * @param time time of Partner App Synced
     */
    public static void setPartnerDataSynced(long time) {
        PreferenceUtil.getPreferenceWrapper().putLong(PartnerPrefKey.KEY_PARTNER_DATA_SYNC,
                time);
    }

    /**
     * Get Genie First Launch Value
     *
     * @return if Genie component launched it'll be false
     */
    public static boolean getGenieFirstLaunch() {
        return PreferenceUtil.getPreferenceWrapper()
                .getBoolean(PartnerPrefKey.KEY_GENIE_FIRST_LAUNCH, true);
    }

    /**
     * Set Genie First Launch Value
     *
     * @param isFirst launch status
     */
    public static void setGenieFirstLaunch(boolean isFirst) {
        PreferenceUtil.getPreferenceWrapper()
                .putBoolean(PartnerPrefKey.KEY_GENIE_FIRST_LAUNCH, isFirst);
    }

    /**
     * Get the selected district value
     *
     * @return null if it's empty
     */
    public static String getDistrict() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_DISTRICT, null);
    }

    /**
     * Set the selected district
     *
     * @param district district values
     */
    public static void setDistrict(String district) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_DISTRICT, district);
    }

    /**
     * Get the selected block value
     *
     * @return null if it's empty
     */
    public static String getBlock() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_BLOCK, null);
    }

    /**
     * Set the selected block
     *
     * @param block block values
     */
    public static void setBlock(String block) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_BLOCK, block);
    }

    /**
     * Get the selected cluster value
     *
     * @return null if it's empty
     */
    public static String getCluster() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_CLUSTER, null);
    }

    /**
     * Set the selected cluster
     *
     * @param cluster cluster values
     */
    public static void setCluster(String cluster) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_CLUSTER, cluster);
    }

    /**
     * Get the selected school value
     *
     * @return null if it's empty
     */
    public static String getSchool() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_SCHOOL, null);
    }

    /**
     * Set the selected school
     *
     * @param school school values
     */
    public static void setSchool(String school) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_SCHOOL, school);
    }

    /**
     * Get the selected schoolId value
     *
     * @return null if it's empty
     */
    public static String getSchoolId() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_SCHOOL_ID, null);
    }

    /**
     * Set the selected schoolId
     *
     * @param schoolId schoolId values
     */
    public static void setSchoolId(String schoolId) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_SCHOOL_ID, schoolId);
    }

    /**
     * Get the selected schoolId value
     *
     * @return null if it's empty
     */
    public static String getStudentClass() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_SELECTED_CLASS, null);
    }

    /**
     * Set the selected klass
     *
     * @param klass klass values
     */
    public static void setStudentClass(String klass) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_SELECTED_CLASS, klass);
    }

    public static boolean isPartnerFirstLaunch() {
        return PreferenceUtil.getPreferenceWrapper()
                .getBoolean(PartnerPrefKey.KEY_PARTNER_FIRST_LAUNCH, true);
    }


    public static void setPartnerFirstLaunch(boolean isFirst) {
        PreferenceUtil.getPreferenceWrapper().putBoolean(PartnerPrefKey.KEY_PARTNER_FIRST_LAUNCH, isFirst);
    }


    public static int getPartnerAppVersion() {
        return PreferenceUtil.getPreferenceWrapper().getInt(PartnerPrefKey.KEY_PARTNER_APP_VERSION,
                -1);
    }

    public static void setPartnerAppVersion(int version) {
        PreferenceUtil.getPreferenceWrapper().putInt(PartnerPrefKey.KEY_PARTNER_APP_VERSION,
                version);
    }

    public static void setOpenRapHostAndPort(String host, int port) {
        PreferenceUtil.getPreferenceWrapper().putString(PartnerPrefKey.KEY_OPEN_RAP_HOST, host);
        PreferenceUtil.getPreferenceWrapper().putInt(PartnerPrefKey.KEY_OPEN_RAP_PORT, port);
    }

    public static String getOpenRapHost() {
        return PreferenceUtil.getPreferenceWrapper().getString(PartnerPrefKey.KEY_OPEN_RAP_HOST, null);
    }

    public static int getOpenRapPort() {
        return PreferenceUtil.getPreferenceWrapper().getInt(PartnerPrefKey.KEY_OPEN_RAP_PORT, 0);
    }
}
