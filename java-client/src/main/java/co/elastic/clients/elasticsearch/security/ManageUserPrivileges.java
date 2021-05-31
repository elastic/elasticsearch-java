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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security._types.ManageUserPrivileges
public final class ManageUserPrivileges implements ToJsonp {
	private final List<String> applications;

	// ---------------------------------------------------------------------------------------------

	protected ManageUserPrivileges(Builder builder) {

		this.applications = Objects.requireNonNull(builder.applications, "applications");

	}

	/**
	 * API name: {@code applications}
	 */
	public List<String> applications() {
		return this.applications;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("applications");
		generator.writeStartArray();
		for (String item0 : this.applications) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ManageUserPrivileges}.
	 */
	public static class Builder implements ObjectBuilder<ManageUserPrivileges> {
		private List<String> applications;

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(List<String> value) {
			this.applications = value;
			return this;
		}

		/**
		 * API name: {@code applications}
		 */
		public Builder applications(String... value) {
			this.applications = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #applications(List)}, creating the list if needed.
		 */
		public Builder addApplications(String value) {
			if (this.applications == null) {
				this.applications = new ArrayList<>();
			}
			this.applications.add(value);
			return this;
		}

		/**
		 * Builds a {@link ManageUserPrivileges}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ManageUserPrivileges build() {

			return new ManageUserPrivileges(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ManageUserPrivileges
	 */
	public static final JsonpValueParser<ManageUserPrivileges> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ManageUserPrivileges::setupManageUserPrivilegesParser);

	protected static void setupManageUserPrivilegesParser(DelegatingJsonpValueParser<ManageUserPrivileges.Builder> op) {

		op.add(Builder::applications, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "applications");

	}

}
