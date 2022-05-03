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

package co.elastic.clients.elasticsearch.ml.info;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.info.NativeCode

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.info.NativeCode">API
 *      specification</a>
 */
@JsonpDeserializable
public class NativeCode implements JsonpSerializable {
	private final String buildHash;

	private final String version;

	// ---------------------------------------------------------------------------------------------

	private NativeCode(Builder builder) {

		this.buildHash = ApiTypeHelper.requireNonNull(builder.buildHash, this, "buildHash");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static NativeCode of(Function<Builder, ObjectBuilder<NativeCode>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code build_hash}
	 */
	public final String buildHash() {
		return this.buildHash;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NativeCode}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NativeCode> {
		private String buildHash;

		private String version;

		/**
		 * Required - API name: {@code build_hash}
		 */
		public final Builder buildHash(String value) {
			this.buildHash = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NativeCode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NativeCode build() {
			_checkSingleUse();

			return new NativeCode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NativeCode}
	 */
	public static final JsonpDeserializer<NativeCode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NativeCode::setupNativeCodeDeserializer);

	protected static void setupNativeCodeDeserializer(ObjectDeserializer<NativeCode.Builder> op) {

		op.add(Builder::buildHash, JsonpDeserializer.stringDeserializer(), "build_hash");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
