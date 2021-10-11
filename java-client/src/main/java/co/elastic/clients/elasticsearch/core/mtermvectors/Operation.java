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

package co.elastic.clients.elasticsearch.core.mtermvectors;

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.termvectors.Filter;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.mtermvectors.Operation
@JsonpDeserializable
public final class Operation implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final JsonValue doc;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean fieldStatistics;

	@Nullable
	private final Filter filter;

	@Nullable
	private final Boolean offsets;

	@Nullable
	private final Boolean payloads;

	@Nullable
	private final Boolean positions;

	@Nullable
	private final String routing;

	@Nullable
	private final Boolean termStatistics;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	public Operation(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = builder.index;
		this.doc = builder.doc;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.fieldStatistics = builder.fieldStatistics;
		this.filter = builder.filter;
		this.offsets = builder.offsets;
		this.payloads = builder.payloads;
		this.positions = builder.positions;
		this.routing = builder.routing;
		this.termStatistics = builder.termStatistics;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public Operation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code _index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public JsonValue doc() {
		return this.doc;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Filter filter() {
		return this.filter;
	}

	/**
	 * API name: {@code offsets}
	 */
	@Nullable
	public Boolean offsets() {
		return this.offsets;
	}

	/**
	 * API name: {@code payloads}
	 */
	@Nullable
	public Boolean payloads() {
		return this.payloads;
	}

	/**
	 * API name: {@code positions}
	 */
	@Nullable
	public Boolean positions() {
		return this.positions;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code term_statistics}
	 */
	@Nullable
	public Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public VersionType versionType() {
		return this.versionType;
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

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.index != null) {

			generator.writeKey("_index");
			generator.write(this.index);

		}
		if (this.doc != null) {

			generator.writeKey("doc");
			generator.write(this.doc);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.fieldStatistics != null) {

			generator.writeKey("field_statistics");
			generator.write(this.fieldStatistics);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.offsets != null) {

			generator.writeKey("offsets");
			generator.write(this.offsets);

		}
		if (this.payloads != null) {

			generator.writeKey("payloads");
			generator.write(this.payloads);

		}
		if (this.positions != null) {

			generator.writeKey("positions");
			generator.write(this.positions);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.termStatistics != null) {

			generator.writeKey("term_statistics");
			generator.write(this.termStatistics);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {

			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Operation}.
	 */
	public static class Builder implements ObjectBuilder<Operation> {
		private String id;

		@Nullable
		private String index;

		@Nullable
		private JsonValue doc;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean fieldStatistics;

		@Nullable
		private Filter filter;

		@Nullable
		private Boolean offsets;

		@Nullable
		private Boolean payloads;

		@Nullable
		private Boolean positions;

		@Nullable
		private String routing;

		@Nullable
		private Boolean termStatistics;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * Required - API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public Builder doc(@Nullable JsonValue value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable Filter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<Filter.Builder, ObjectBuilder<Filter>> fn) {
			return this.filter(fn.apply(new Filter.Builder()).build());
		}

		/**
		 * API name: {@code offsets}
		 */
		public Builder offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * API name: {@code payloads}
		 */
		public Builder payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * API name: {@code positions}
		 */
		public Builder positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code term_statistics}
		 */
		public Builder termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Builds a {@link Operation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Operation build() {

			return new Operation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Operation}
	 */
	public static final JsonpDeserializer<Operation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Operation::setupOperationDeserializer, Builder::build);

	protected static void setupOperationDeserializer(DelegatingDeserializer<Operation.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::doc, JsonpDeserializer.jsonValueDeserializer(), "doc");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fieldStatistics, JsonpDeserializer.booleanDeserializer(), "field_statistics");
		op.add(Builder::filter, Filter._DESERIALIZER, "filter");
		op.add(Builder::offsets, JsonpDeserializer.booleanDeserializer(), "offsets");
		op.add(Builder::payloads, JsonpDeserializer.booleanDeserializer(), "payloads");
		op.add(Builder::positions, JsonpDeserializer.booleanDeserializer(), "positions");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::termStatistics, JsonpDeserializer.booleanDeserializer(), "term_statistics");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
