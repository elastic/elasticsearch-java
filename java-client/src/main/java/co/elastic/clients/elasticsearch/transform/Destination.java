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

package co.elastic.clients.elasticsearch.transform;

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

// typedef: transform._types.Destination

/**
 *
 * @see <a href="../doc-files/api-spec.html#transform._types.Destination">API
 *      specification</a>
 */
@JsonpDeserializable
public class Destination implements JsonpSerializable {
	@Nullable
	private final String index;

	private final List<DestinationAlias> aliases;

	@Nullable
	private final String pipeline;

	// ---------------------------------------------------------------------------------------------

	private Destination(Builder builder) {

		this.index = builder.index;
		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.pipeline = builder.pipeline;

	}

	public static Destination of(Function<Builder, ObjectBuilder<Destination>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The destination index for the transform. The mappings of the destination
	 * index are deduced based on the source fields when possible. If alternate
	 * mappings are required, use the create index API prior to starting the
	 * transform.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * The aliases that the destination index for the transform should have. Aliases
	 * are manipulated using the stored credentials of the transform, which means
	 * the secondary credentials supplied at creation time (if both primary and
	 * secondary credentials are specified).
	 * <p>
	 * The destination index is added to the aliases regardless of whether the
	 * destination index was created by the transform or pre-created by the user.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final List<DestinationAlias> aliases() {
		return this.aliases;
	}

	/**
	 * The unique identifier for an ingest pipeline.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
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

		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartArray();
			for (DestinationAlias item0 : this.aliases) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Destination}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Destination> {
		@Nullable
		private String index;

		@Nullable
		private List<DestinationAlias> aliases;

		@Nullable
		private String pipeline;

		public Builder() {
		}
		private Builder(Destination instance) {
			this.index = instance.index;
			this.aliases = instance.aliases;
			this.pipeline = instance.pipeline;

		}
		/**
		 * The destination index for the transform. The mappings of the destination
		 * index are deduced based on the source fields when possible. If alternate
		 * mappings are required, use the create index API prior to starting the
		 * transform.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * The aliases that the destination index for the transform should have. Aliases
		 * are manipulated using the stored credentials of the transform, which means
		 * the secondary credentials supplied at creation time (if both primary and
		 * secondary credentials are specified).
		 * <p>
		 * The destination index is added to the aliases regardless of whether the
		 * destination index was created by the transform or pre-created by the user.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aliases</code>.
		 */
		public final Builder aliases(List<DestinationAlias> list) {
			this.aliases = _listAddAll(this.aliases, list);
			return this;
		}

		/**
		 * The aliases that the destination index for the transform should have. Aliases
		 * are manipulated using the stored credentials of the transform, which means
		 * the secondary credentials supplied at creation time (if both primary and
		 * secondary credentials are specified).
		 * <p>
		 * The destination index is added to the aliases regardless of whether the
		 * destination index was created by the transform or pre-created by the user.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds one or more values to <code>aliases</code>.
		 */
		public final Builder aliases(DestinationAlias value, DestinationAlias... values) {
			this.aliases = _listAdd(this.aliases, value, values);
			return this;
		}

		/**
		 * The aliases that the destination index for the transform should have. Aliases
		 * are manipulated using the stored credentials of the transform, which means
		 * the secondary credentials supplied at creation time (if both primary and
		 * secondary credentials are specified).
		 * <p>
		 * The destination index is added to the aliases regardless of whether the
		 * destination index was created by the transform or pre-created by the user.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds a value to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(Function<DestinationAlias.Builder, ObjectBuilder<DestinationAlias>> fn) {
			return aliases(fn.apply(new DestinationAlias.Builder()).build());
		}

		/**
		 * The unique identifier for an ingest pipeline.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Destination}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Destination build() {
			_checkSingleUse();

			return new Destination(this);
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
	 * Json deserializer for {@link Destination}
	 */
	public static final JsonpDeserializer<Destination> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Destination::setupDestinationDeserializer);

	protected static void setupDestinationDeserializer(ObjectDeserializer<Destination.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(DestinationAlias._DESERIALIZER), "aliases");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");

	}

}
