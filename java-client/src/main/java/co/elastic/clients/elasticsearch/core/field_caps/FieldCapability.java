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

package co.elastic.clients.elasticsearch.core.field_caps;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapability
@JsonpDeserializable
public class FieldCapability implements JsonpSerializable {
	private final boolean aggregatable;

	private final List<String> indices;

	private final Map<String, List<String>> meta;

	private final List<String> nonAggregatableIndices;

	private final List<String> nonSearchableIndices;

	private final boolean searchable;

	private final String type;

	@Nullable
	private final Boolean metadataField;

	// ---------------------------------------------------------------------------------------------

	private FieldCapability(Builder builder) {

		this.aggregatable = ModelTypeHelper.requireNonNull(builder.aggregatable, this, "aggregatable");
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.nonAggregatableIndices = ModelTypeHelper.unmodifiable(builder.nonAggregatableIndices);
		this.nonSearchableIndices = ModelTypeHelper.unmodifiable(builder.nonSearchableIndices);
		this.searchable = ModelTypeHelper.requireNonNull(builder.searchable, this, "searchable");
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.metadataField = builder.metadataField;

	}

	public static FieldCapability of(Function<Builder, ObjectBuilder<FieldCapability>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aggregatable}
	 */
	public final boolean aggregatable() {
		return this.aggregatable;
	}

	/**
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code meta}
	 */
	public final Map<String, List<String>> meta() {
		return this.meta;
	}

	/**
	 * API name: {@code non_aggregatable_indices}
	 */
	public final List<String> nonAggregatableIndices() {
		return this.nonAggregatableIndices;
	}

	/**
	 * API name: {@code non_searchable_indices}
	 */
	public final List<String> nonSearchableIndices() {
		return this.nonSearchableIndices;
	}

	/**
	 * Required - API name: {@code searchable}
	 */
	public final boolean searchable() {
		return this.searchable;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code metadata_field}
	 */
	@Nullable
	public final Boolean metadataField() {
		return this.metadataField;
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

		generator.writeKey("aggregatable");
		generator.write(this.aggregatable);

		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.nonAggregatableIndices)) {
			generator.writeKey("non_aggregatable_indices");
			generator.writeStartArray();
			for (String item0 : this.nonAggregatableIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.nonSearchableIndices)) {
			generator.writeKey("non_searchable_indices");
			generator.writeStartArray();
			for (String item0 : this.nonSearchableIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("searchable");
		generator.write(this.searchable);

		generator.writeKey("type");
		generator.write(this.type);

		if (this.metadataField != null) {
			generator.writeKey("metadata_field");
			generator.write(this.metadataField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapability}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldCapability> {
		private Boolean aggregatable;

		@Nullable
		private List<String> indices;

		@Nullable
		private Map<String, List<String>> meta;

		@Nullable
		private List<String> nonAggregatableIndices;

		@Nullable
		private List<String> nonSearchableIndices;

		private Boolean searchable;

		private String type;

		@Nullable
		private Boolean metadataField;

		/**
		 * Required - API name: {@code aggregatable}
		 */
		public final Builder aggregatable(boolean value) {
			this.aggregatable = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public final Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code meta}
		 */
		public final Builder meta(@Nullable Map<String, List<String>> value) {
			this.meta = value;
			return this;
		}

		/**
		 * API name: {@code non_aggregatable_indices}
		 */
		public final Builder nonAggregatableIndices(@Nullable List<String> value) {
			this.nonAggregatableIndices = value;
			return this;
		}

		/**
		 * API name: {@code non_aggregatable_indices}
		 */
		public final Builder nonAggregatableIndices(String... value) {
			this.nonAggregatableIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code non_searchable_indices}
		 */
		public final Builder nonSearchableIndices(@Nullable List<String> value) {
			this.nonSearchableIndices = value;
			return this;
		}

		/**
		 * API name: {@code non_searchable_indices}
		 */
		public final Builder nonSearchableIndices(String... value) {
			this.nonSearchableIndices = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code searchable}
		 */
		public final Builder searchable(boolean value) {
			this.searchable = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code metadata_field}
		 */
		public final Builder metadataField(@Nullable Boolean value) {
			this.metadataField = value;
			return this;
		}

		/**
		 * Builds a {@link FieldCapability}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapability build() {
			_checkSingleUse();

			return new FieldCapability(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldCapability}
	 */
	public static final JsonpDeserializer<FieldCapability> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldCapability::setupFieldCapabilityDeserializer, Builder::build);

	protected static void setupFieldCapabilityDeserializer(DelegatingDeserializer<FieldCapability.Builder> op) {

		op.add(Builder::aggregatable, JsonpDeserializer.booleanDeserializer(), "aggregatable");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "meta");
		op.add(Builder::nonAggregatableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"non_aggregatable_indices");
		op.add(Builder::nonSearchableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "non_searchable_indices");
		op.add(Builder::searchable, JsonpDeserializer.booleanDeserializer(), "searchable");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::metadataField, JsonpDeserializer.booleanDeserializer(), "metadata_field");

	}

}
