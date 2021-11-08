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
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSegmentSort
@JsonpDeserializable
public class IndexSegmentSort implements JsonpSerializable {
	private final List<String> field;

	private final List<SegmentSortOrder> order;

	@Nullable
	private final SegmentSortMode mode;

	@Nullable
	private final SegmentSortMissing missing;

	// ---------------------------------------------------------------------------------------------

	private IndexSegmentSort(Builder builder) {

		this.field = ModelTypeHelper.unmodifiableRequired(builder.field, this, "field");
		this.order = ModelTypeHelper.unmodifiableRequired(builder.order, this, "order");
		this.mode = builder.mode;
		this.missing = builder.missing;

	}

	public static IndexSegmentSort of(Function<Builder, ObjectBuilder<IndexSegmentSort>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final List<String> field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code order}
	 */
	public final List<SegmentSortOrder> order() {
		return this.order;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final SegmentSortMode mode() {
		return this.mode;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final SegmentSortMissing missing() {
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

		if (ModelTypeHelper.isDefined(this.field)) {
			generator.writeKey("field");
			generator.writeStartArray();
			for (String item0 : this.field) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (SegmentSortOrder item0 : this.order) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSegmentSort}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexSegmentSort> {
		private List<String> field;

		private List<SegmentSortOrder> order;

		@Nullable
		private SegmentSortMode mode;

		@Nullable
		private SegmentSortMissing missing;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(List<String> value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String... value) {
			this.field = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code order}
		 */
		public final Builder order(List<SegmentSortOrder> value) {
			this.order = value;
			return this;
		}

		/**
		 * Required - API name: {@code order}
		 */
		public final Builder order(SegmentSortOrder... value) {
			this.order = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable SegmentSortMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable SegmentSortMissing value) {
			this.missing = value;
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
			IndexSegmentSort::setupIndexSegmentSortDeserializer, Builder::build);

	protected static void setupIndexSegmentSortDeserializer(DelegatingDeserializer<IndexSegmentSort.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "field");
		op.add(Builder::order, JsonpDeserializer.arrayDeserializer(SegmentSortOrder._DESERIALIZER), "order");
		op.add(Builder::mode, SegmentSortMode._DESERIALIZER, "mode");
		op.add(Builder::missing, SegmentSortMissing._DESERIALIZER, "missing");

	}

}
