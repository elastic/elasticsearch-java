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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MatrixStatsAggregate
@JsonpDeserializable
public class MatrixStatsAggregate extends AggregateBase implements AggregateVariant {
	private final long docCount;

	private final List<MatrixStatsFields> fields;

	// ---------------------------------------------------------------------------------------------

	private MatrixStatsAggregate(Builder builder) {
		super(builder);

		this.docCount = ModelTypeHelper.requireNonNull(builder.docCount, this, "docCount");
		this.fields = ModelTypeHelper.unmodifiableRequired(builder.fields, this, "fields");

	}

	public static MatrixStatsAggregate of(Function<Builder, ObjectBuilder<MatrixStatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "matrix_stats";
	}

	/**
	 * Required - API name: {@code doc_count}
	 */
	public final long docCount() {
		return this.docCount;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final List<MatrixStatsFields> fields() {
		return this.fields;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("doc_count");
		generator.write(this.docCount);

		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (MatrixStatsFields item0 : this.fields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatrixStatsAggregate}.
	 */
	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatrixStatsAggregate> {
		private Long docCount;

		private List<MatrixStatsFields> fields;

		/**
		 * Required - API name: {@code doc_count}
		 */
		public final Builder docCount(long value) {
			this.docCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(List<MatrixStatsFields> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(MatrixStatsFields... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		@SafeVarargs
		public final Builder fields(Function<MatrixStatsFields.Builder, ObjectBuilder<MatrixStatsFields>>... fns) {
			this.fields = new ArrayList<>(fns.length);
			for (Function<MatrixStatsFields.Builder, ObjectBuilder<MatrixStatsFields>> fn : fns) {
				this.fields.add(fn.apply(new MatrixStatsFields.Builder()).build());
			}
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatrixStatsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatrixStatsAggregate build() {
			_checkSingleUse();

			return new MatrixStatsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatrixStatsAggregate}
	 */
	public static final JsonpDeserializer<MatrixStatsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatrixStatsAggregate::setupMatrixStatsAggregateDeserializer, Builder::build);

	protected static void setupMatrixStatsAggregateDeserializer(
			DelegatingDeserializer<MatrixStatsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(MatrixStatsFields._DESERIALIZER), "fields");

	}

}
