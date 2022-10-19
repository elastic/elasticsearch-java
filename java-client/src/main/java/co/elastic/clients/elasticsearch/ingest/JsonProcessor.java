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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.JsonProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.JsonProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class JsonProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final Boolean addToRoot;

	@Nullable
	private final JsonProcessorConflictStrategy addToRootConflictStrategy;

	@Nullable
	private final Boolean allowDuplicateKeys;

	private final String field;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private JsonProcessor(Builder builder) {
		super(builder);

		this.addToRoot = builder.addToRoot;
		this.addToRootConflictStrategy = builder.addToRootConflictStrategy;
		this.allowDuplicateKeys = builder.allowDuplicateKeys;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.targetField = builder.targetField;

	}

	public static JsonProcessor of(Function<Builder, ObjectBuilder<JsonProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Json;
	}

	/**
	 * API name: {@code add_to_root}
	 */
	@Nullable
	public final Boolean addToRoot() {
		return this.addToRoot;
	}

	/**
	 * API name: {@code add_to_root_conflict_strategy}
	 */
	@Nullable
	public final JsonProcessorConflictStrategy addToRootConflictStrategy() {
		return this.addToRootConflictStrategy;
	}

	/**
	 * API name: {@code allow_duplicate_keys}
	 */
	@Nullable
	public final Boolean allowDuplicateKeys() {
		return this.allowDuplicateKeys;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.addToRoot != null) {
			generator.writeKey("add_to_root");
			generator.write(this.addToRoot);

		}
		if (this.addToRootConflictStrategy != null) {
			generator.writeKey("add_to_root_conflict_strategy");
			this.addToRootConflictStrategy.serialize(generator, mapper);
		}
		if (this.allowDuplicateKeys != null) {
			generator.writeKey("allow_duplicate_keys");
			generator.write(this.allowDuplicateKeys);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JsonProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<JsonProcessor> {
		@Nullable
		private Boolean addToRoot;

		@Nullable
		private JsonProcessorConflictStrategy addToRootConflictStrategy;

		@Nullable
		private Boolean allowDuplicateKeys;

		private String field;

		@Nullable
		private String targetField;

		/**
		 * API name: {@code add_to_root}
		 */
		public final Builder addToRoot(@Nullable Boolean value) {
			this.addToRoot = value;
			return this;
		}

		/**
		 * API name: {@code add_to_root_conflict_strategy}
		 */
		public final Builder addToRootConflictStrategy(@Nullable JsonProcessorConflictStrategy value) {
			this.addToRootConflictStrategy = value;
			return this;
		}

		/**
		 * API name: {@code allow_duplicate_keys}
		 */
		public final Builder allowDuplicateKeys(@Nullable Boolean value) {
			this.allowDuplicateKeys = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JsonProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JsonProcessor build() {
			_checkSingleUse();

			return new JsonProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JsonProcessor}
	 */
	public static final JsonpDeserializer<JsonProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JsonProcessor::setupJsonProcessorDeserializer);

	protected static void setupJsonProcessorDeserializer(ObjectDeserializer<JsonProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::addToRoot, JsonpDeserializer.booleanDeserializer(), "add_to_root");
		op.add(Builder::addToRootConflictStrategy, JsonProcessorConflictStrategy._DESERIALIZER,
				"add_to_root_conflict_strategy");
		op.add(Builder::allowDuplicateKeys, JsonpDeserializer.booleanDeserializer(), "allow_duplicate_keys");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
