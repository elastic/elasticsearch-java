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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.Pivot

/**
 *
 * @see <a href="../doc-files/api-spec.html#transform._types.Pivot">API
 *      specification</a>
 */
@JsonpDeserializable
public class Pivot implements JsonpSerializable {
	private final Map<String, Aggregation> aggregations;

	private final Map<String, PivotGroupBy> groupBy;

	// ---------------------------------------------------------------------------------------------

	private Pivot(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiable(builder.aggregations);
		this.groupBy = ApiTypeHelper.unmodifiable(builder.groupBy);

	}

	public static Pivot of(Function<Builder, ObjectBuilder<Pivot>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Defines how to aggregate the grouped data. The following aggregations are
	 * currently supported: average, bucket script, bucket selector, cardinality,
	 * filter, geo bounds, geo centroid, geo line, max, median absolute deviation,
	 * min, missing, percentiles, rare terms, scripted metric, stats, sum, terms,
	 * top metrics, value count, weighted average.
	 * <p>
	 * API name: {@code aggregations}
	 */
	public final Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * Defines how to group the data. More than one grouping can be defined per
	 * pivot. The following groupings are currently supported: date histogram,
	 * geotile grid, histogram, terms.
	 * <p>
	 * API name: {@code group_by}
	 */
	public final Map<String, PivotGroupBy> groupBy() {
		return this.groupBy;
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

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.groupBy)) {
			generator.writeKey("group_by");
			generator.writeStartObject();
			for (Map.Entry<String, PivotGroupBy> item0 : this.groupBy.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link Pivot}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Pivot> {
		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private Map<String, PivotGroupBy> groupBy;

		/**
		 * Defines how to aggregate the grouped data. The following aggregations are
		 * currently supported: average, bucket script, bucket selector, cardinality,
		 * filter, geo bounds, geo centroid, geo line, max, median absolute deviation,
		 * min, missing, percentiles, rare terms, scripted metric, stats, sum, terms,
		 * top metrics, value count, weighted average.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(Map<String, Aggregation> map) {
			this.aggregations = _mapPutAll(this.aggregations, map);
			return this;
		}

		/**
		 * Defines how to aggregate the grouped data. The following aggregations are
		 * currently supported: average, bucket script, bucket selector, cardinality,
		 * filter, geo bounds, geo centroid, geo line, max, median absolute deviation,
		 * min, missing, percentiles, rare terms, scripted metric, stats, sum, terms,
		 * top metrics, value count, weighted average.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code>.
		 */
		public final Builder aggregations(String key, Aggregation value) {
			this.aggregations = _mapPut(this.aggregations, key, value);
			return this;
		}

		/**
		 * Defines how to aggregate the grouped data. The following aggregations are
		 * currently supported: average, bucket script, bucket selector, cardinality,
		 * filter, geo bounds, geo centroid, geo line, max, median absolute deviation,
		 * min, missing, percentiles, rare terms, scripted metric, stats, sum, terms,
		 * top metrics, value count, weighted average.
		 * <p>
		 * API name: {@code aggregations}
		 * <p>
		 * Adds an entry to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return aggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * Defines how to group the data. More than one grouping can be defined per
		 * pivot. The following groupings are currently supported: date histogram,
		 * geotile grid, histogram, terms.
		 * <p>
		 * API name: {@code group_by}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>groupBy</code>.
		 */
		public final Builder groupBy(Map<String, PivotGroupBy> map) {
			this.groupBy = _mapPutAll(this.groupBy, map);
			return this;
		}

		/**
		 * Defines how to group the data. More than one grouping can be defined per
		 * pivot. The following groupings are currently supported: date histogram,
		 * geotile grid, histogram, terms.
		 * <p>
		 * API name: {@code group_by}
		 * <p>
		 * Adds an entry to <code>groupBy</code>.
		 */
		public final Builder groupBy(String key, PivotGroupBy value) {
			this.groupBy = _mapPut(this.groupBy, key, value);
			return this;
		}

		/**
		 * Defines how to group the data. More than one grouping can be defined per
		 * pivot. The following groupings are currently supported: date histogram,
		 * geotile grid, histogram, terms.
		 * <p>
		 * API name: {@code group_by}
		 * <p>
		 * Adds an entry to <code>groupBy</code> using a builder lambda.
		 */
		public final Builder groupBy(String key, Function<PivotGroupBy.Builder, ObjectBuilder<PivotGroupBy>> fn) {
			return groupBy(key, fn.apply(new PivotGroupBy.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Pivot}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pivot build() {
			_checkSingleUse();

			return new Pivot(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pivot}
	 */
	public static final JsonpDeserializer<Pivot> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pivot::setupPivotDeserializer);

	protected static void setupPivotDeserializer(ObjectDeserializer<Pivot.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations", "aggs");
		op.add(Builder::groupBy, JsonpDeserializer.stringMapDeserializer(PivotGroupBy._DESERIALIZER), "group_by");

	}

}
