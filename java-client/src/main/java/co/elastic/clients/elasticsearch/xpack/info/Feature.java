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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.info.Feature
@JsonpDeserializable
public final class Feature implements JsonpSerializable {
	private final boolean available;

	@Nullable
	private final String description;

	private final boolean enabled;

	@Nullable
	private final NativeCodeInformation nativeCodeInfo;

	// ---------------------------------------------------------------------------------------------

	public Feature(Builder builder) {

		this.available = Objects.requireNonNull(builder.available, "available");
		this.description = builder.description;
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.nativeCodeInfo = builder.nativeCodeInfo;

	}

	public Feature(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code available}
	 */
	public boolean available() {
		return this.available;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code native_code_info}
	 */
	@Nullable
	public NativeCodeInformation nativeCodeInfo() {
		return this.nativeCodeInfo;
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

		generator.writeKey("available");
		generator.write(this.available);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (this.nativeCodeInfo != null) {

			generator.writeKey("native_code_info");
			this.nativeCodeInfo.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Feature}.
	 */
	public static class Builder implements ObjectBuilder<Feature> {
		private Boolean available;

		@Nullable
		private String description;

		private Boolean enabled;

		@Nullable
		private NativeCodeInformation nativeCodeInfo;

		/**
		 * Required - API name: {@code available}
		 */
		public Builder available(boolean value) {
			this.available = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code native_code_info}
		 */
		public Builder nativeCodeInfo(@Nullable NativeCodeInformation value) {
			this.nativeCodeInfo = value;
			return this;
		}

		/**
		 * API name: {@code native_code_info}
		 */
		public Builder nativeCodeInfo(
				Function<NativeCodeInformation.Builder, ObjectBuilder<NativeCodeInformation>> fn) {
			return this.nativeCodeInfo(fn.apply(new NativeCodeInformation.Builder()).build());
		}

		/**
		 * Builds a {@link Feature}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Feature build() {

			return new Feature(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Feature}
	 */
	public static final JsonpDeserializer<Feature> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Feature::setupFeatureDeserializer, Builder::build);

	protected static void setupFeatureDeserializer(DelegatingDeserializer<Feature.Builder> op) {

		op.add(Builder::available, JsonpDeserializer.booleanDeserializer(), "available");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::nativeCodeInfo, NativeCodeInformation._DESERIALIZER, "native_code_info");

	}

}
