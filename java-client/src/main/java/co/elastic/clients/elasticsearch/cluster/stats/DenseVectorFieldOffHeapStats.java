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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

// typedef: cluster.stats.DenseVectorFieldOffHeapStats

/**
 * The off-heap stats of a <code>dense_vector</code> field.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.DenseVectorFieldOffHeapStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorFieldOffHeapStats implements JsonpSerializable {
	private final Map<String, Long> sizes;

	private final List<DenseVectorAutoCalibration> autoCalibration;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorFieldOffHeapStats(Builder builder) {

		this.sizes = ApiTypeHelper.unmodifiable(builder.sizes);

		this.autoCalibration = ApiTypeHelper.unmodifiable(builder.autoCalibration);

	}

	public static DenseVectorFieldOffHeapStats of(Function<Builder, ObjectBuilder<DenseVectorFieldOffHeapStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The off-heap sizes of the field, keyed by file extension, such as
	 * <code>vec_size_bytes</code>.
	 */
	public final Map<String, Long> sizes() {
		return this.sizes;
	}

	/**
	 * The auto-calibration information of the field, aggregated by distinct set of
	 * parameters. Only returned when <code>include_auto_calibration</code> is
	 * <code>true</code>.
	 * <p>
	 * API name: {@code auto_calibration}
	 */
	public final List<DenseVectorAutoCalibration> autoCalibration() {
		return this.autoCalibration;
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

		for (Map.Entry<String, Long> item0 : this.sizes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}

		if (ApiTypeHelper.isDefined(this.autoCalibration)) {
			generator.writeKey("auto_calibration");
			generator.writeStartArray();
			for (DenseVectorAutoCalibration item0 : this.autoCalibration) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link DenseVectorFieldOffHeapStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorFieldOffHeapStats> {
		@Nullable
		private Map<String, Long> sizes = new HashMap<>();

		/**
		 * The off-heap sizes of the field, keyed by file extension, such as
		 * <code>vec_size_bytes</code>.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>sizes</code>.
		 */
		public final Builder sizes(Map<String, Long> map) {
			this.sizes = _mapPutAll(this.sizes, map);
			return this;
		}

		/**
		 * The off-heap sizes of the field, keyed by file extension, such as
		 * <code>vec_size_bytes</code>.
		 * <p>
		 * Adds an entry to <code>sizes</code>.
		 */
		public final Builder sizes(String key, Long value) {
			this.sizes = _mapPut(this.sizes, key, value);
			return this;
		}

		@Nullable
		private List<DenseVectorAutoCalibration> autoCalibration;

		public Builder() {
		}
		private Builder(DenseVectorFieldOffHeapStats instance) {
			this.autoCalibration = instance.autoCalibration;
			this.sizes = instance.sizes;

		}
		/**
		 * The auto-calibration information of the field, aggregated by distinct set of
		 * parameters. Only returned when <code>include_auto_calibration</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>autoCalibration</code>.
		 */
		public final Builder autoCalibration(List<DenseVectorAutoCalibration> list) {
			this.autoCalibration = _listAddAll(this.autoCalibration, list);
			return this;
		}

		/**
		 * The auto-calibration information of the field, aggregated by distinct set of
		 * parameters. Only returned when <code>include_auto_calibration</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds one or more values to <code>autoCalibration</code>.
		 */
		public final Builder autoCalibration(DenseVectorAutoCalibration value, DenseVectorAutoCalibration... values) {
			this.autoCalibration = _listAdd(this.autoCalibration, value, values);
			return this;
		}

		/**
		 * The auto-calibration information of the field, aggregated by distinct set of
		 * parameters. Only returned when <code>include_auto_calibration</code> is
		 * <code>true</code>.
		 * <p>
		 * API name: {@code auto_calibration}
		 * <p>
		 * Adds a value to <code>autoCalibration</code> using a builder lambda.
		 */
		public final Builder autoCalibration(
				Function<DenseVectorAutoCalibration.Builder, ObjectBuilder<DenseVectorAutoCalibration>> fn) {
			return autoCalibration(fn.apply(new DenseVectorAutoCalibration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorFieldOffHeapStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorFieldOffHeapStats build() {
			_checkSingleUse();

			return new DenseVectorFieldOffHeapStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorFieldOffHeapStats}
	 */
	public static final JsonpDeserializer<DenseVectorFieldOffHeapStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorFieldOffHeapStats::setupDenseVectorFieldOffHeapStatsDeserializer);

	protected static void setupDenseVectorFieldOffHeapStatsDeserializer(
			ObjectDeserializer<DenseVectorFieldOffHeapStats.Builder> op) {

		op.add(Builder::autoCalibration, JsonpDeserializer.arrayDeserializer(DenseVectorAutoCalibration._DESERIALIZER),
				"auto_calibration");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.sizes(name, JsonpDeserializer.longDeserializer().deserialize(parser, mapper));
		});

	}

}
