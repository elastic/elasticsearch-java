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

package co.elastic.clients.elasticsearch.xpack.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.info.BuildInformation
public final class BuildInformation implements JsonpSerializable {
	private final String date;

	private final String hash;

	// ---------------------------------------------------------------------------------------------

	public BuildInformation(Builder builder) {

		this.date = Objects.requireNonNull(builder.date, "date");
		this.hash = Objects.requireNonNull(builder.hash, "hash");

	}

	/**
	 * API name: {@code date}
	 */
	public String date() {
		return this.date;
	}

	/**
	 * API name: {@code hash}
	 */
	public String hash() {
		return this.hash;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("date");
		generator.write(this.date);

		generator.writeKey("hash");
		generator.write(this.hash);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BuildInformation}.
	 */
	public static class Builder implements ObjectBuilder<BuildInformation> {
		private String date;

		private String hash;

		/**
		 * API name: {@code date}
		 */
		public Builder date(String value) {
			this.date = value;
			return this;
		}

		/**
		 * API name: {@code hash}
		 */
		public Builder hash(String value) {
			this.hash = value;
			return this;
		}

		/**
		 * Builds a {@link BuildInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BuildInformation build() {

			return new BuildInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BuildInformation}
	 */
	public static final JsonpDeserializer<BuildInformation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BuildInformation::setupBuildInformationDeserializer);

	protected static void setupBuildInformationDeserializer(DelegatingDeserializer<BuildInformation.Builder> op) {

		op.add(Builder::date, JsonpDeserializer.stringDeserializer(), "date");
		op.add(Builder::hash, JsonpDeserializer.stringDeserializer(), "hash");

	}

}
