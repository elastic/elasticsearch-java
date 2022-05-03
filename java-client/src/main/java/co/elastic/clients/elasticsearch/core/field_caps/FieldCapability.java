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

import co.elastic.clients.elasticsearch._types.mapping.TimeSeriesMetricType;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapability

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.field_caps.FieldCapability">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldCapability implements JsonpSerializable {
	private final boolean aggregatable;

	private final List<String> indices;

	private final Map<String, JsonData> meta;

	private final List<String> nonAggregatableIndices;

	private final List<String> nonSearchableIndices;

	private final boolean searchable;

	private final String type;

	@Nullable
	private final Boolean metadataField;

	@Nullable
	private final Boolean timeSeriesDimension;

	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	private final List<String> nonDimensionIndices;

	private final List<String> metricConflictsIndices;

	// ---------------------------------------------------------------------------------------------

	private FieldCapability(Builder builder) {

		this.aggregatable = ApiTypeHelper.requireNonNull(builder.aggregatable, this, "aggregatable");
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.nonAggregatableIndices = ApiTypeHelper.unmodifiable(builder.nonAggregatableIndices);
		this.nonSearchableIndices = ApiTypeHelper.unmodifiable(builder.nonSearchableIndices);
		this.searchable = ApiTypeHelper.requireNonNull(builder.searchable, this, "searchable");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.metadataField = builder.metadataField;
		this.timeSeriesDimension = builder.timeSeriesDimension;
		this.timeSeriesMetric = builder.timeSeriesMetric;
		this.nonDimensionIndices = ApiTypeHelper.unmodifiable(builder.nonDimensionIndices);
		this.metricConflictsIndices = ApiTypeHelper.unmodifiable(builder.metricConflictsIndices);

	}

	public static FieldCapability of(Function<Builder, ObjectBuilder<FieldCapability>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether this field can be aggregated on all indices.
	 * <p>
	 * API name: {@code aggregatable}
	 */
	public final boolean aggregatable() {
		return this.aggregatable;
	}

	/**
	 * The list of indices where this field has the same type family, or null if all
	 * indices have the same type family for the field.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Merged metadata across all indices as a map of string keys to arrays of
	 * values. A value length of 1 indicates that all indices had the same value for
	 * this key, while a length of 2 or more indicates that not all indices had the
	 * same value for this key.
	 * <p>
	 * API name: {@code meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * The list of indices where this field is not aggregatable, or null if all
	 * indices have the same definition for the field.
	 * <p>
	 * API name: {@code non_aggregatable_indices}
	 */
	public final List<String> nonAggregatableIndices() {
		return this.nonAggregatableIndices;
	}

	/**
	 * The list of indices where this field is not searchable, or null if all
	 * indices have the same definition for the field.
	 * <p>
	 * API name: {@code non_searchable_indices}
	 */
	public final List<String> nonSearchableIndices() {
		return this.nonSearchableIndices;
	}

	/**
	 * Required - Whether this field is indexed for search on all indices.
	 * <p>
	 * API name: {@code searchable}
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
	 * Whether this field is registered as a metadata field.
	 * <p>
	 * API name: {@code metadata_field}
	 */
	@Nullable
	public final Boolean metadataField() {
		return this.metadataField;
	}

	/**
	 * Whether this field is used as a time series dimension.
	 * <p>
	 * API name: {@code time_series_dimension}
	 */
	@Nullable
	public final Boolean timeSeriesDimension() {
		return this.timeSeriesDimension;
	}

	/**
	 * Contains metric type if this fields is used as a time series metrics, absent
	 * if the field is not used as metric.
	 * <p>
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	/**
	 * If this list is present in response then some indices have the field marked
	 * as a dimension and other indices, the ones in this list, do not.
	 * <p>
	 * API name: {@code non_dimension_indices}
	 */
	public final List<String> nonDimensionIndices() {
		return this.nonDimensionIndices;
	}

	/**
	 * The list of indices where this field is present if these indices don’t have
	 * the same <code>time_series_metric</code> value for this field.
	 * <p>
	 * API name: {@code metric_conflicts_indices}
	 */
	public final List<String> metricConflictsIndices() {
		return this.metricConflictsIndices;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nonAggregatableIndices)) {
			generator.writeKey("non_aggregatable_indices");
			generator.writeStartArray();
			for (String item0 : this.nonAggregatableIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nonSearchableIndices)) {
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
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.nonDimensionIndices)) {
			generator.writeKey("non_dimension_indices");
			generator.writeStartArray();
			for (String item0 : this.nonDimensionIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metricConflictsIndices)) {
			generator.writeKey("metric_conflicts_indices");
			generator.writeStartArray();
			for (String item0 : this.metricConflictsIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapability}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldCapability> {
		private Boolean aggregatable;

		@Nullable
		private List<String> indices;

		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private List<String> nonAggregatableIndices;

		@Nullable
		private List<String> nonSearchableIndices;

		private Boolean searchable;

		private String type;

		@Nullable
		private Boolean metadataField;

		@Nullable
		private Boolean timeSeriesDimension;

		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		@Nullable
		private List<String> nonDimensionIndices;

		@Nullable
		private List<String> metricConflictsIndices;

		/**
		 * Required - Whether this field can be aggregated on all indices.
		 * <p>
		 * API name: {@code aggregatable}
		 */
		public final Builder aggregatable(boolean value) {
			this.aggregatable = value;
			return this;
		}

		/**
		 * The list of indices where this field has the same type family, or null if all
		 * indices have the same type family for the field.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * The list of indices where this field has the same type family, or null if all
		 * indices have the same type family for the field.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Merged metadata across all indices as a map of string keys to arrays of
		 * values. A value length of 1 indicates that all indices had the same value for
		 * this key, while a length of 2 or more indicates that not all indices had the
		 * same value for this key.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Merged metadata across all indices as a map of string keys to arrays of
		 * values. A value length of 1 indicates that all indices had the same value for
		 * this key, while a length of 2 or more indicates that not all indices had the
		 * same value for this key.
		 * <p>
		 * API name: {@code meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * The list of indices where this field is not aggregatable, or null if all
		 * indices have the same definition for the field.
		 * <p>
		 * API name: {@code non_aggregatable_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>nonAggregatableIndices</code>.
		 */
		public final Builder nonAggregatableIndices(List<String> list) {
			this.nonAggregatableIndices = _listAddAll(this.nonAggregatableIndices, list);
			return this;
		}

		/**
		 * The list of indices where this field is not aggregatable, or null if all
		 * indices have the same definition for the field.
		 * <p>
		 * API name: {@code non_aggregatable_indices}
		 * <p>
		 * Adds one or more values to <code>nonAggregatableIndices</code>.
		 */
		public final Builder nonAggregatableIndices(String value, String... values) {
			this.nonAggregatableIndices = _listAdd(this.nonAggregatableIndices, value, values);
			return this;
		}

		/**
		 * The list of indices where this field is not searchable, or null if all
		 * indices have the same definition for the field.
		 * <p>
		 * API name: {@code non_searchable_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nonSearchableIndices</code>.
		 */
		public final Builder nonSearchableIndices(List<String> list) {
			this.nonSearchableIndices = _listAddAll(this.nonSearchableIndices, list);
			return this;
		}

		/**
		 * The list of indices where this field is not searchable, or null if all
		 * indices have the same definition for the field.
		 * <p>
		 * API name: {@code non_searchable_indices}
		 * <p>
		 * Adds one or more values to <code>nonSearchableIndices</code>.
		 */
		public final Builder nonSearchableIndices(String value, String... values) {
			this.nonSearchableIndices = _listAdd(this.nonSearchableIndices, value, values);
			return this;
		}

		/**
		 * Required - Whether this field is indexed for search on all indices.
		 * <p>
		 * API name: {@code searchable}
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
		 * Whether this field is registered as a metadata field.
		 * <p>
		 * API name: {@code metadata_field}
		 */
		public final Builder metadataField(@Nullable Boolean value) {
			this.metadataField = value;
			return this;
		}

		/**
		 * Whether this field is used as a time series dimension.
		 * <p>
		 * API name: {@code time_series_dimension}
		 */
		public final Builder timeSeriesDimension(@Nullable Boolean value) {
			this.timeSeriesDimension = value;
			return this;
		}

		/**
		 * Contains metric type if this fields is used as a time series metrics, absent
		 * if the field is not used as metric.
		 * <p>
		 * API name: {@code time_series_metric}
		 */
		public final Builder timeSeriesMetric(@Nullable TimeSeriesMetricType value) {
			this.timeSeriesMetric = value;
			return this;
		}

		/**
		 * If this list is present in response then some indices have the field marked
		 * as a dimension and other indices, the ones in this list, do not.
		 * <p>
		 * API name: {@code non_dimension_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nonDimensionIndices</code>.
		 */
		public final Builder nonDimensionIndices(List<String> list) {
			this.nonDimensionIndices = _listAddAll(this.nonDimensionIndices, list);
			return this;
		}

		/**
		 * If this list is present in response then some indices have the field marked
		 * as a dimension and other indices, the ones in this list, do not.
		 * <p>
		 * API name: {@code non_dimension_indices}
		 * <p>
		 * Adds one or more values to <code>nonDimensionIndices</code>.
		 */
		public final Builder nonDimensionIndices(String value, String... values) {
			this.nonDimensionIndices = _listAdd(this.nonDimensionIndices, value, values);
			return this;
		}

		/**
		 * The list of indices where this field is present if these indices don’t have
		 * the same <code>time_series_metric</code> value for this field.
		 * <p>
		 * API name: {@code metric_conflicts_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>metricConflictsIndices</code>.
		 */
		public final Builder metricConflictsIndices(List<String> list) {
			this.metricConflictsIndices = _listAddAll(this.metricConflictsIndices, list);
			return this;
		}

		/**
		 * The list of indices where this field is present if these indices don’t have
		 * the same <code>time_series_metric</code> value for this field.
		 * <p>
		 * API name: {@code metric_conflicts_indices}
		 * <p>
		 * Adds one or more values to <code>metricConflictsIndices</code>.
		 */
		public final Builder metricConflictsIndices(String value, String... values) {
			this.metricConflictsIndices = _listAdd(this.metricConflictsIndices, value, values);
			return this;
		}

		@Override
		protected Builder self() {
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
			FieldCapability::setupFieldCapabilityDeserializer);

	protected static void setupFieldCapabilityDeserializer(ObjectDeserializer<FieldCapability.Builder> op) {

		op.add(Builder::aggregatable, JsonpDeserializer.booleanDeserializer(), "aggregatable");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "meta");
		op.add(Builder::nonAggregatableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"non_aggregatable_indices");
		op.add(Builder::nonSearchableIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "non_searchable_indices");
		op.add(Builder::searchable, JsonpDeserializer.booleanDeserializer(), "searchable");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::metadataField, JsonpDeserializer.booleanDeserializer(), "metadata_field");
		op.add(Builder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");
		op.add(Builder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");
		op.add(Builder::nonDimensionIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "non_dimension_indices");
		op.add(Builder::metricConflictsIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"metric_conflicts_indices");

	}

}
