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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.SourceField
@JsonpDeserializable
public class SourceField implements JsonpSerializable {
	@Nullable
	private final Boolean compress;

	@Nullable
	private final String compressThreshold;

	@Nullable
	private final Boolean enabled;

	private final List<String> excludes;

	private final List<String> includes;

	// ---------------------------------------------------------------------------------------------

	private SourceField(Builder builder) {

		this.compress = builder.compress;
		this.compressThreshold = builder.compressThreshold;
		this.enabled = builder.enabled;
		this.excludes = ModelTypeHelper.unmodifiable(builder.excludes);
		this.includes = ModelTypeHelper.unmodifiable(builder.includes);

	}

	public static SourceField of(Function<Builder, ObjectBuilder<SourceField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code compress}
	 */
	@Nullable
	public final Boolean compress() {
		return this.compress;
	}

	/**
	 * API name: {@code compress_threshold}
	 */
	@Nullable
	public final String compressThreshold() {
		return this.compressThreshold;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code excludes}
	 */
	public final List<String> excludes() {
		return this.excludes;
	}

	/**
	 * API name: {@code includes}
	 */
	public final List<String> includes() {
		return this.includes;
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

		if (this.compress != null) {
			generator.writeKey("compress");
			generator.write(this.compress);

		}
		if (this.compressThreshold != null) {
			generator.writeKey("compress_threshold");
			generator.write(this.compressThreshold);

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (ModelTypeHelper.isDefined(this.excludes)) {
			generator.writeKey("excludes");
			generator.writeStartArray();
			for (String item0 : this.excludes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.includes)) {
			generator.writeKey("includes");
			generator.writeStartArray();
			for (String item0 : this.includes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SourceField}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SourceField> {
		@Nullable
		private Boolean compress;

		@Nullable
		private String compressThreshold;

		@Nullable
		private Boolean enabled;

		@Nullable
		private List<String> excludes;

		@Nullable
		private List<String> includes;

		/**
		 * API name: {@code compress}
		 */
		public final Builder compress(@Nullable Boolean value) {
			this.compress = value;
			return this;
		}

		/**
		 * API name: {@code compress_threshold}
		 */
		public final Builder compressThreshold(@Nullable String value) {
			this.compressThreshold = value;
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code excludes}
		 */
		public final Builder excludes(@Nullable List<String> value) {
			this.excludes = value;
			return this;
		}

		/**
		 * API name: {@code excludes}
		 */
		public final Builder excludes(String... value) {
			this.excludes = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code includes}
		 */
		public final Builder includes(@Nullable List<String> value) {
			this.includes = value;
			return this;
		}

		/**
		 * API name: {@code includes}
		 */
		public final Builder includes(String... value) {
			this.includes = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link SourceField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SourceField build() {
			_checkSingleUse();

			return new SourceField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SourceField}
	 */
	public static final JsonpDeserializer<SourceField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SourceField::setupSourceFieldDeserializer, Builder::build);

	protected static void setupSourceFieldDeserializer(DelegatingDeserializer<SourceField.Builder> op) {

		op.add(Builder::compress, JsonpDeserializer.booleanDeserializer(), "compress");
		op.add(Builder::compressThreshold, JsonpDeserializer.stringDeserializer(), "compress_threshold");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::excludes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"excludes");
		op.add(Builder::includes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"includes");

	}

}
