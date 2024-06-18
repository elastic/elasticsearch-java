/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.transport;

import co.elastic.clients.ApiClient;

import javax.annotation.Nullable;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * This class represents a SemVer version, with an optional patch revision.
 */
public class Version {

    private final int major;
    private final int minor;
    private final int maintenance;
    private final String prerelease;
    private final String build;

    /**
     * Parse a version string formatted using the standard Maven version format.
     *
     * @return the version, or {@code null} if the version could not be parsed.
     */
    public static Version parse(String version) {
        String prerelease = null;
        String build = null;

        int hyphen = version.indexOf('-');
        if (hyphen >= 0) {
            // Has prerelease. May be followed buy build information
            prerelease = version.substring(hyphen + 1);
            version = version.substring(0, hyphen);

            int plus = prerelease.indexOf('+');
            if (plus >= 0) {
                build = prerelease.substring(0, plus + 1);
                prerelease = prerelease.substring(0, plus);
            }
        }

        int plus = version.indexOf('+');
        if (plus >= 0) {
            // Has build information
            build = version.substring(0, plus + 1);
            version = version.substring(0, plus);
        }

        String[] bits = version.split("\\.");
        try {
            int major = (bits.length >= 1) ? Integer.parseInt(bits[0]) : 0;
            int minor = (bits.length >= 2) ? Integer.parseInt(bits[1]) : 0;
            int maintenance = (bits.length >= 3) ? Integer.parseInt(bits[2]) : -1;
            return new Version(major, minor, maintenance, prerelease, build);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Version(int major, int minor, int maintenance, boolean isPreRelease) {
        this(major, minor, maintenance, isPreRelease ? "p" : null, null);
    }

    public Version(int major, int minor, int maintenance, @Nullable String prerelease,
                   @Nullable String build) {
        this.major = major;
        this.minor = minor;
        this.maintenance = maintenance;
        this.prerelease = prerelease;
        this.build = build;
    }

    public int major() {
        return major;
    }

    public int minor() {
        return minor;
    }

    public int maintenance() {
        return maintenance;
    }

    public boolean isPreRelease() {
        return prerelease != null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Version)) return false;
        Version that = (Version) other;
        return (major == that.major &&
            minor == that.minor &&
            maintenance == that.maintenance &&
            Objects.equals(prerelease, that.prerelease) &&
            Objects.equals(build, that.build));
    }

    @Override
    public int hashCode() {
        return Objects.hash(major, minor, maintenance, prerelease, build);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(major);
        s.append('.');
        s.append(minor);
        if (maintenance != -1) {
            s.append('.');
            s.append(maintenance);
        }
        if (prerelease != null) {
            s.append('-').append(prerelease);
        }
        if (build != null) {
            s.append('+').append(build);
        }
        return s.toString();
    }

    /**
     * This library's version. Can be {@code null} if the version could not be determined.
     */
    @Nullable
    public static final Version VERSION;

    static {
        Version version = null;
        InputStream in = ApiClient.class.getResourceAsStream("version.properties");
        if (in != null) {
            Properties properties = new Properties();
            try {
                properties.load(in);
                String versionStr = properties.getProperty("version");
                if (versionStr != null) {
                    version = Version.parse(versionStr);
                }
            } catch (Exception e) {
                // Failed to parse version from file, trying from VersionInfo
                version = Version.parse(VersionInfo.VERSION);
            }
        }
        VERSION = version;
    }
}
