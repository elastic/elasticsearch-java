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

package co.elastic.clients.elasticsearch.indices;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSegmentSort

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.IndexSegmentSort">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSegmentSort implements JsonpSerializable {
	private final List<String> field;

	private final List<SegmentSortOrder> order;

	private final List<SegmentSortMode> mode;

	private final List<SegmentSortMissing> missing;

	// ---------------------------------------------------------------------------------------------

	private IndexSegmentSort(Builder builder) {

		this.field = ApiTypeHelper.unmodifiable(builder.field);
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.mode = ApiTypeHelper.unmodifiable(builder.mode);
		this.missing = ApiTypeHelper.unmodifiable(builder.missing);

	}

	public static IndexSegmentSort of(Function<Builder, ObjectBuilder<IndexSegmentSort>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code field}
	 */
	public final List<String> field() {
		return this.field;
	}

	/**
	 * API name: {@code order}
	 */
	public final List<SegmentSortOrder> order() {
		return this.order;
	}

	/**
	 * API name: {@code mode}
	 */
	public final List<SegmentSortMode> mode() {
		return this.mode;
	}

	/**
	 * API name: {@code missing}
	 */
	public final List<SegmentSortMissing> missing() {
		return this.missing;
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

		if (ApiTypeHelper.isDefined(this.field)) {
			generator.writeKey("field");
			generator.writeStartArray();
			for (String item0 : this.field) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (SegmentSortOrder item0 : this.order) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.mode)) {
			generator.writeKey("mode");
			generator.writeStartArray();
			for (SegmentSortMode item0 : this.mode) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.missing)) {
			generator.writeKey("missing");
			generator.writeStartArray();
			for (SegmentSortMissing item0 : this.missing) {
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
	 * Builder for {@link IndexSegmentSort}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexSegmentSort> {
		@Nullable
		private List<String> field;

		@Nullable
		private List<SegmentSortOrder> order;

		@Nullable
		private List<SegmentSortMode> mode;

		@Nullable
		private List<SegmentSortMissing> missing;

		/**
		 * API name: {@code field}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>field</code>.
		 */
		public final Builder field(List<String> list) {
			this.field = _listAddAll(this.field, list);
			return this;
		}

		/**
		 * API name: {@code field}
		 * <p>
		 * Adds one or more values to <code>field</code>.
		 */
		public final Builder field(String value, String... values) {
			this.field = _listAdd(this.field, value, values);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<SegmentSortOrder> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(SegmentSortOrder value, SegmentSortOrder... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * API name: {@code mode}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>mode</code>.
		 */
		public final Builder mode(List<SegmentSortMode> list) {
			this.mode = _listAddAll(this.mode, list);
			return this;
		}

		/**
		 * API name: {@code mode}
		 * <p>
		 * Adds one or more values to <code>mode</code>.
		 */
		public final Builder mode(SegmentSortMode value, SegmentSortMode... values) {
			this.mode = _listAdd(this.mode, value, values);
			return this;
		}

		/**
		 * API name: {@code missing}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>missing</code>.
		 */
		public final Builder missing(List<SegmentSortMissing> list) {
			this.missing = _listAddAll(this.missing, list);
			return this;
		}

		/**
		 * API name: {@code missing}
		 * <p>
		 * Adds one or more values to <code>missing</code>.
		 */
		public final Builder missing(SegmentSortMissing value, SegmentSortMissing... values) {
			this.missing = _listAdd(this.missing, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSegmentSort}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSegmentSort build() {
			_checkSingleUse();

			return new IndexSegmentSort(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSegmentSort}
	 */
	public static final JsonpDeserializer<IndexSegmentSort> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexSegmentSort::setupIndexSegmentSortDeserializer);

	protected static void setupIndexSegmentSortDeserializer(ObjectDeserializer<IndexSegmentSort.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "field");
		op.add(Builder::order, JsonpDeserializer.arrayDeserializer(SegmentSortOrder._DESERIALIZER), "order");
		op.add(Builder::mode, JsonpDeserializer.arrayDeserializer(SegmentSortMode._DESERIALIZER), "mode");
		op.add(Builder::missing, JsonpDeserializer.arrayDeserializer(SegmentSortMissing._DESERIALIZER), "missing");

	}

}
