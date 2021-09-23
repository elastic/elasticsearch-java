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

// typedef: xpack.info.NativeCodeInformation
public final class NativeCodeInformation implements JsonpSerializable {
	private final String buildHash;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	public NativeCodeInformation(Builder builder) {

		this.buildHash = Objects.requireNonNull(builder.buildHash, "build_hash");
		this.version = Objects.requireNonNull(builder.version, "version");

	}

	/**
	 * API name: {@code build_hash}
	 */
	public String buildHash() {
		return this.buildHash;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
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

		generator.writeKey("build_hash");
		generator.write(this.buildHash);

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NativeCodeInformation}.
	 */
	public static class Builder implements ObjectBuilder<NativeCodeInformation> {
		private String buildHash;

		private String version;

		/**
		 * API name: {@code build_hash}
		 */
		public Builder buildHash(String value) {
			this.buildHash = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link NativeCodeInformation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NativeCodeInformation build() {

			return new NativeCodeInformation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NativeCodeInformation}
	 */
	public static final JsonpDeserializer<NativeCodeInformation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NativeCodeInformation::setupNativeCodeInformationDeserializer);

	protected static void setupNativeCodeInformationDeserializer(
			DelegatingDeserializer<NativeCodeInformation.Builder> op) {

		op.add(Builder::buildHash, JsonpDeserializer.stringDeserializer(), "build_hash");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
