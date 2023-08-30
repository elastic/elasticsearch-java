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

package co.elastic.clients.elasticsearch._types.query_dsl;

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
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsAllOf

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsAllOf">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsAllOf implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	private final List<Intervals> intervals;

	@Nullable
	private final Integer maxGaps;

	@Nullable
	private final Boolean ordered;

	@Nullable
	private final IntervalsFilter filter;

	// ---------------------------------------------------------------------------------------------

	private IntervalsAllOf(Builder builder) {

		this.intervals = ApiTypeHelper.unmodifiableRequired(builder.intervals, this, "intervals");
		this.maxGaps = builder.maxGaps;
		this.ordered = builder.ordered;
		this.filter = builder.filter;

	}

	public static IntervalsAllOf of(Function<Builder, ObjectBuilder<IntervalsAllOf>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.AllOf;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.AllOf;
	}

	/**
	 * Required - An array of rules to combine. All rules must produce a match in a
	 * document for the overall source to match.
	 * <p>
	 * API name: {@code intervals}
	 */
	public final List<Intervals> intervals() {
		return this.intervals;
	}

	/**
	 * Maximum number of positions between the matching terms. Intervals produced by
	 * the rules further apart than this are not considered matches.
	 * <p>
	 * API name: {@code max_gaps}
	 */
	@Nullable
	public final Integer maxGaps() {
		return this.maxGaps;
	}

	/**
	 * If <code>true</code>, intervals produced by the rules should appear in the
	 * order in which they are specified.
	 * <p>
	 * API name: {@code ordered}
	 */
	@Nullable
	public final Boolean ordered() {
		return this.ordered;
	}

	/**
	 * Rule used to filter returned intervals.
	 * <p>
	 * API name: {@code filter}
	 */
	@Nullable
	public final IntervalsFilter filter() {
		return this.filter;
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

		if (ApiTypeHelper.isDefined(this.intervals)) {
			generator.writeKey("intervals");
			generator.writeStartArray();
			for (Intervals item0 : this.intervals) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxGaps != null) {
			generator.writeKey("max_gaps");
			generator.write(this.maxGaps);

		}
		if (this.ordered != null) {
			generator.writeKey("ordered");
			generator.write(this.ordered);

		}
		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsAllOf}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsAllOf> {
		private List<Intervals> intervals;

		@Nullable
		private Integer maxGaps;

		@Nullable
		private Boolean ordered;

		@Nullable
		private IntervalsFilter filter;

		/**
		 * Required - An array of rules to combine. All rules must produce a match in a
		 * document for the overall source to match.
		 * <p>
		 * API name: {@code intervals}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>intervals</code>.
		 */
		public final Builder intervals(List<Intervals> list) {
			this.intervals = _listAddAll(this.intervals, list);
			return this;
		}

		/**
		 * Required - An array of rules to combine. All rules must produce a match in a
		 * document for the overall source to match.
		 * <p>
		 * API name: {@code intervals}
		 * <p>
		 * Adds one or more values to <code>intervals</code>.
		 */
		public final Builder intervals(Intervals value, Intervals... values) {
			this.intervals = _listAdd(this.intervals, value, values);
			return this;
		}

		/**
		 * Required - An array of rules to combine. All rules must produce a match in a
		 * document for the overall source to match.
		 * <p>
		 * API name: {@code intervals}
		 * <p>
		 * Adds a value to <code>intervals</code> using a builder lambda.
		 */
		public final Builder intervals(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
			return intervals(fn.apply(new Intervals.Builder()).build());
		}

		/**
		 * Maximum number of positions between the matching terms. Intervals produced by
		 * the rules further apart than this are not considered matches.
		 * <p>
		 * API name: {@code max_gaps}
		 */
		public final Builder maxGaps(@Nullable Integer value) {
			this.maxGaps = value;
			return this;
		}

		/**
		 * If <code>true</code>, intervals produced by the rules should appear in the
		 * order in which they are specified.
		 * <p>
		 * API name: {@code ordered}
		 */
		public final Builder ordered(@Nullable Boolean value) {
			this.ordered = value;
			return this;
		}

		/**
		 * Rule used to filter returned intervals.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable IntervalsFilter value) {
			this.filter = value;
			return this;
		}

		/**
		 * Rule used to filter returned intervals.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(Function<IntervalsFilter.Builder, ObjectBuilder<IntervalsFilter>> fn) {
			return this.filter(fn.apply(new IntervalsFilter.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IntervalsAllOf}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsAllOf build() {
			_checkSingleUse();

			return new IntervalsAllOf(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsAllOf}
	 */
	public static final JsonpDeserializer<IntervalsAllOf> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsAllOf::setupIntervalsAllOfDeserializer);

	protected static void setupIntervalsAllOfDeserializer(ObjectDeserializer<IntervalsAllOf.Builder> op) {

		op.add(Builder::intervals, JsonpDeserializer.arrayDeserializer(Intervals._DESERIALIZER), "intervals");
		op.add(Builder::maxGaps, JsonpDeserializer.integerDeserializer(), "max_gaps");
		op.add(Builder::ordered, JsonpDeserializer.booleanDeserializer(), "ordered");
		op.add(Builder::filter, IntervalsFilter._DESERIALIZER, "filter");

	}

}
