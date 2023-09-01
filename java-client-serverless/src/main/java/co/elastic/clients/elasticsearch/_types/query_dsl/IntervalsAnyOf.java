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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsAnyOf

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.IntervalsAnyOf">API
 *      specification</a>
 */
@JsonpDeserializable
public class IntervalsAnyOf implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	private final List<Intervals> intervals;

	@Nullable
	private final IntervalsFilter filter;

	// ---------------------------------------------------------------------------------------------

	private IntervalsAnyOf(Builder builder) {

		this.intervals = ApiTypeHelper.unmodifiableRequired(builder.intervals, this, "intervals");
		this.filter = builder.filter;

	}

	public static IntervalsAnyOf of(Function<Builder, ObjectBuilder<IntervalsAnyOf>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsQuery variant kind.
	 */
	@Override
	public IntervalsQuery.Kind _intervalsQueryKind() {
		return IntervalsQuery.Kind.AnyOf;
	}

	/**
	 * Intervals variant kind.
	 */
	@Override
	public Intervals.Kind _intervalsKind() {
		return Intervals.Kind.AnyOf;
	}

	/**
	 * Required - An array of rules to match.
	 * <p>
	 * API name: {@code intervals}
	 */
	public final List<Intervals> intervals() {
		return this.intervals;
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
	 * Builder for {@link IntervalsAnyOf}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IntervalsAnyOf> {
		private List<Intervals> intervals;

		@Nullable
		private IntervalsFilter filter;

		/**
		 * Required - An array of rules to match.
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
		 * Required - An array of rules to match.
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
		 * Required - An array of rules to match.
		 * <p>
		 * API name: {@code intervals}
		 * <p>
		 * Adds a value to <code>intervals</code> using a builder lambda.
		 */
		public final Builder intervals(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
			return intervals(fn.apply(new Intervals.Builder()).build());
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
		 * Builds a {@link IntervalsAnyOf}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsAnyOf build() {
			_checkSingleUse();

			return new IntervalsAnyOf(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsAnyOf}
	 */
	public static final JsonpDeserializer<IntervalsAnyOf> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsAnyOf::setupIntervalsAnyOfDeserializer);

	protected static void setupIntervalsAnyOfDeserializer(ObjectDeserializer<IntervalsAnyOf.Builder> op) {

		op.add(Builder::intervals, JsonpDeserializer.arrayDeserializer(Intervals._DESERIALIZER), "intervals");
		op.add(Builder::filter, IntervalsFilter._DESERIALIZER, "filter");

	}

}
