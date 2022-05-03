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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.GeoHashPrecision;
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
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.CompletionContext

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.CompletionContext">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionContext implements JsonpSerializable {
	@Nullable
	private final Double boost;

	private final Context context;

	private final List<GeoHashPrecision> neighbours;

	@Nullable
	private final GeoHashPrecision precision;

	@Nullable
	private final Boolean prefix;

	// ---------------------------------------------------------------------------------------------

	private CompletionContext(Builder builder) {

		this.boost = builder.boost;
		this.context = ApiTypeHelper.requireNonNull(builder.context, this, "context");
		this.neighbours = ApiTypeHelper.unmodifiable(builder.neighbours);
		this.precision = builder.precision;
		this.prefix = builder.prefix;

	}

	public static CompletionContext of(Function<Builder, ObjectBuilder<CompletionContext>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * Required - API name: {@code context}
	 */
	public final Context context() {
		return this.context;
	}

	/**
	 * API name: {@code neighbours}
	 */
	public final List<GeoHashPrecision> neighbours() {
		return this.neighbours;
	}

	/**
	 * API name: {@code precision}
	 */
	@Nullable
	public final GeoHashPrecision precision() {
		return this.precision;
	}

	/**
	 * API name: {@code prefix}
	 */
	@Nullable
	public final Boolean prefix() {
		return this.prefix;
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

		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		generator.writeKey("context");
		this.context.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.neighbours)) {
			generator.writeKey("neighbours");
			generator.writeStartArray();
			for (GeoHashPrecision item0 : this.neighbours) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.precision != null) {
			generator.writeKey("precision");
			this.precision.serialize(generator, mapper);

		}
		if (this.prefix != null) {
			generator.writeKey("prefix");
			generator.write(this.prefix);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionContext}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CompletionContext> {
		@Nullable
		private Double boost;

		private Context context;

		@Nullable
		private List<GeoHashPrecision> neighbours;

		@Nullable
		private GeoHashPrecision precision;

		@Nullable
		private Boolean prefix;

		/**
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * Required - API name: {@code context}
		 */
		public final Builder context(Context value) {
			this.context = value;
			return this;
		}

		/**
		 * Required - API name: {@code context}
		 */
		public final Builder context(Function<Context.Builder, ObjectBuilder<Context>> fn) {
			return this.context(fn.apply(new Context.Builder()).build());
		}

		/**
		 * API name: {@code neighbours}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>neighbours</code>.
		 */
		public final Builder neighbours(List<GeoHashPrecision> list) {
			this.neighbours = _listAddAll(this.neighbours, list);
			return this;
		}

		/**
		 * API name: {@code neighbours}
		 * <p>
		 * Adds one or more values to <code>neighbours</code>.
		 */
		public final Builder neighbours(GeoHashPrecision value, GeoHashPrecision... values) {
			this.neighbours = _listAdd(this.neighbours, value, values);
			return this;
		}

		/**
		 * API name: {@code neighbours}
		 * <p>
		 * Adds a value to <code>neighbours</code> using a builder lambda.
		 */
		public final Builder neighbours(Function<GeoHashPrecision.Builder, ObjectBuilder<GeoHashPrecision>> fn) {
			return neighbours(fn.apply(new GeoHashPrecision.Builder()).build());
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(@Nullable GeoHashPrecision value) {
			this.precision = value;
			return this;
		}

		/**
		 * API name: {@code precision}
		 */
		public final Builder precision(Function<GeoHashPrecision.Builder, ObjectBuilder<GeoHashPrecision>> fn) {
			return this.precision(fn.apply(new GeoHashPrecision.Builder()).build());
		}

		/**
		 * API name: {@code prefix}
		 */
		public final Builder prefix(@Nullable Boolean value) {
			this.prefix = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionContext build() {
			_checkSingleUse();

			return new CompletionContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionContext}
	 */
	public static final JsonpDeserializer<CompletionContext> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompletionContext::setupCompletionContextDeserializer);

	protected static void setupCompletionContextDeserializer(ObjectDeserializer<CompletionContext.Builder> op) {

		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::context, Context._DESERIALIZER, "context");
		op.add(Builder::neighbours, JsonpDeserializer.arrayDeserializer(GeoHashPrecision._DESERIALIZER), "neighbours");
		op.add(Builder::precision, GeoHashPrecision._DESERIALIZER, "precision");
		op.add(Builder::prefix, JsonpDeserializer.booleanDeserializer(), "prefix");

		op.shortcutProperty("context");

	}

}
