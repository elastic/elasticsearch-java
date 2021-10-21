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

package co.elastic.clients.base;

import java.util.Objects;

/**
 * This class represents an immutable product version, as specified in
 * <a href="https://github.com/elastic/clients-team/blob/master/knowledgebase/specifications/client-meta-header.md#registries">
 *     Structured HTTP Header for Client Metadata</a>.
 *
 * In that specification it is stated that a version string must match
 * the following regex:
 *     <code>^[0-9]{1,2}\.[0-9]{1,2}(?:\.[0-9]{1,3})?p?$</code>.
 *
 * Therefore, the following rules are encoded within this class:
 *
 * 1. The major and minor versions are mandatory and can be any value
 *    between 0 and 99 inclusive. It is unstated in the specification,
 *    but the assumption is made that leading zeros do not affect the
 *    value of the field, i.e. "05" is equal to "5". Values outside
 *    the range 0..99 will throw an exception.
 * 2. The maintenance version is optional can be any value between
 *    0 and 999 inclusive. As above, it is assumed that leading zeros
 *    do not affect the field value, and values outside the given
 *    range will throw an exception. To model optionality, the special
 *    value -1 can be used to denote omission.
 *
 * @see <a href="https://github.com/elastic/dev/blob/main/releases/time_based_releases.md#versioning">
 *     Time-based releases &emdash; Versioning</a>
 *
 */
public class Version {

    private final int major;
    private final int minor;
    private final int maintenance;
    private final boolean isPreRelease;

    /**
     * Parse a version string formatted using the standard Maven version format.
     *
     * @param version
     * @return
     */
    public static Version parse(String version) {
        int hyphen = version.indexOf('-');
        boolean isPreRelease;
        if (hyphen >= 0) {
            version = version.substring(0, hyphen);
            isPreRelease = true;
        }
        else {
            isPreRelease = false;
        }
        String[] bits = version.split("\\.");
        try {
            int major = (bits.length >= 1) ? Integer.parseInt(bits[0]) : 0;
            int minor = (bits.length >= 2) ? Integer.parseInt(bits[1]) : 0;
            int maintenance = (bits.length >= 3) ? Integer.parseInt(bits[2]) : -1;
            return new Version(major, minor, maintenance, isPreRelease);
        }
        catch(NumberFormatException ex) {
            throw new IllegalArgumentException("Failed to parse numeric version components in " + version);
        }
    }

    public Version(int major, int minor, int maintenance, boolean isPreRelease) {
        // Set major version
        if (major < 0 || major > 99) {
            throw new IllegalArgumentException("Major version must be between 0 and 99 inclusive");
        }
        this.major = major;

        // Set minor version
        if (minor < 0 || minor > 99) {
            throw new IllegalArgumentException("Minor version must be between 0 and 99 inclusive");
        }
        this.minor = minor;

        // Set maintenance version
        if (maintenance < -1 || maintenance > 999) {
            throw new IllegalArgumentException("Maintenance version must be between 0 and 999 inclusive, or -1 if omitted");
        }
        this.maintenance = maintenance;

        // Set the pre-release flag
        this.isPreRelease = isPreRelease;
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
        return isPreRelease;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Version)) return false;
        Version that = (Version) other;
        return (major == that.major &&
                minor == that.minor &&
                maintenance == that.maintenance &&
                isPreRelease == that.isPreRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(major, minor, maintenance, isPreRelease);
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
        if (isPreRelease) {
            s.append('p');
        }
        return s.toString();
    }

}
