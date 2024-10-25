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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ingest._types.FingerprintProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.FingerprintProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class FingerprintProcessor extends ProcessorBase implements ProcessorVariant {
	private final List<String> fields;

	@Nullable
	private final String targetField;

	@Nullable
	private final String salt;

	@Nullable
	private final FingerprintDigest method;

	@Nullable
	private final Boolean ignoreMissing;

	// ---------------------------------------------------------------------------------------------

	private FingerprintProcessor(Builder builder) {
		super(builder);

		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.targetField = builder.targetField;
		this.salt = builder.salt;
		this.method = builder.method;
		this.ignoreMissing = builder.ignoreMissing;

	}

	public static FingerprintProcessor of(Function<Builder, ObjectBuilder<FingerprintProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Fingerprint;
	}

	/**
	 * Required - Array of fields to include in the fingerprint. For objects, the
	 * processor hashes both the field key and value. For other fields, the
	 * processor hashes only the field value.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Output field for the fingerprint.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * Salt value for the hash function.
	 * <p>
	 * API name: {@code salt}
	 */
	@Nullable
	public final String salt() {
		return this.salt;
	}

	/**
	 * The hash method used to compute the fingerprint. Must be one of MD5, SHA-1,
	 * SHA-256, SHA-512, or MurmurHash3.
	 * <p>
	 * API name: {@code method}
	 */
	@Nullable
	public final FingerprintDigest method() {
		return this.method;
	}

	/**
	 * If true, the processor ignores any missing fields. If all fields are missing,
	 * the processor silently exits without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.salt != null) {
			generator.writeKey("salt");
			generator.write(this.salt);

		}
		if (this.method != null) {
			generator.writeKey("method");
			this.method.serialize(generator, mapper);
		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FingerprintProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FingerprintProcessor> {
		private List<String> fields;

		@Nullable
		private String targetField;

		@Nullable
		private String salt;

		@Nullable
		private FingerprintDigest method;

		@Nullable
		private Boolean ignoreMissing;

		/**
		 * Required - Array of fields to include in the fingerprint. For objects, the
		 * processor hashes both the field key and value. For other fields, the
		 * processor hashes only the field value.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - Array of fields to include in the fingerprint. For objects, the
		 * processor hashes both the field key and value. For other fields, the
		 * processor hashes only the field value.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Output field for the fingerprint.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * Salt value for the hash function.
		 * <p>
		 * API name: {@code salt}
		 */
		public final Builder salt(@Nullable String value) {
			this.salt = value;
			return this;
		}

		/**
		 * The hash method used to compute the fingerprint. Must be one of MD5, SHA-1,
		 * SHA-256, SHA-512, or MurmurHash3.
		 * <p>
		 * API name: {@code method}
		 */
		public final Builder method(@Nullable FingerprintDigest value) {
			this.method = value;
			return this;
		}

		/**
		 * If true, the processor ignores any missing fields. If all fields are missing,
		 * the processor silently exits without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FingerprintProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FingerprintProcessor build() {
			_checkSingleUse();

			return new FingerprintProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FingerprintProcessor}
	 */
	public static final JsonpDeserializer<FingerprintProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FingerprintProcessor::setupFingerprintProcessorDeserializer);

	protected static void setupFingerprintProcessorDeserializer(ObjectDeserializer<FingerprintProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::salt, JsonpDeserializer.stringDeserializer(), "salt");
		op.add(Builder::method, FingerprintDigest._DESERIALIZER, "method");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");

	}

}
