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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch.data_recovery.get_recovery_sources.RecoverySource;
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

// typedef: data_recovery.get_recovery_sources.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_recovery_sources.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRecoverySourcesResponse implements JsonpSerializable {
	private final boolean hasMore;

	private final Point recoveryPoint;

	private final List<RecoverySource> sources;

	// ---------------------------------------------------------------------------------------------

	private GetRecoverySourcesResponse(Builder builder) {

		this.hasMore = ApiTypeHelper.requireNonNull(builder.hasMore, this, "hasMore", false);
		this.recoveryPoint = ApiTypeHelper.requireNonNull(builder.recoveryPoint, this, "recoveryPoint");
		this.sources = ApiTypeHelper.unmodifiableRequired(builder.sources, this, "sources");

	}

	public static GetRecoverySourcesResponse of(Function<Builder, ObjectBuilder<GetRecoverySourcesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether more matching sources are available than were returned.
	 * <p>
	 * API name: {@code has_more}
	 */
	public final boolean hasMore() {
		return this.hasMore;
	}

	/**
	 * Required - The selected recovery point.
	 * <p>
	 * API name: {@code recovery_point}
	 */
	public final Point recoveryPoint() {
		return this.recoveryPoint;
	}

	/**
	 * Required - Matching logical recovery sources ordered by name.
	 * <p>
	 * API name: {@code sources}
	 */
	public final List<RecoverySource> sources() {
		return this.sources;
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

		generator.writeKey("has_more");
		generator.write(this.hasMore);

		generator.writeKey("recovery_point");
		this.recoveryPoint.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.sources)) {
			generator.writeKey("sources");
			generator.writeStartArray();
			for (RecoverySource item0 : this.sources) {
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
	 * Builder for {@link GetRecoverySourcesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRecoverySourcesResponse> {
		private Boolean hasMore;

		private Point recoveryPoint;

		private List<RecoverySource> sources;

		/**
		 * Required - Whether more matching sources are available than were returned.
		 * <p>
		 * API name: {@code has_more}
		 */
		public final Builder hasMore(boolean value) {
			this.hasMore = value;
			return this;
		}

		/**
		 * Required - The selected recovery point.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final Builder recoveryPoint(Point value) {
			this.recoveryPoint = value;
			return this;
		}

		/**
		 * Required - The selected recovery point.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final Builder recoveryPoint(Function<Point.Builder, ObjectBuilder<Point>> fn) {
			return this.recoveryPoint(fn.apply(new Point.Builder()).build());
		}

		/**
		 * Required - Matching logical recovery sources ordered by name.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sources</code>.
		 */
		public final Builder sources(List<RecoverySource> list) {
			this.sources = _listAddAll(this.sources, list);
			return this;
		}

		/**
		 * Required - Matching logical recovery sources ordered by name.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds one or more values to <code>sources</code>.
		 */
		public final Builder sources(RecoverySource value, RecoverySource... values) {
			this.sources = _listAdd(this.sources, value, values);
			return this;
		}

		/**
		 * Required - Matching logical recovery sources ordered by name.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds a value to <code>sources</code> using a builder lambda.
		 */
		public final Builder sources(Function<RecoverySource.Builder, ObjectBuilder<RecoverySource>> fn) {
			return sources(fn.apply(new RecoverySource.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecoverySourcesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecoverySourcesResponse build() {
			_checkSingleUse();

			return new GetRecoverySourcesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecoverySourcesResponse}
	 */
	public static final JsonpDeserializer<GetRecoverySourcesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecoverySourcesResponse::setupGetRecoverySourcesResponseDeserializer);

	protected static void setupGetRecoverySourcesResponseDeserializer(
			ObjectDeserializer<GetRecoverySourcesResponse.Builder> op) {

		op.add(Builder::hasMore, JsonpDeserializer.booleanDeserializer(), "has_more");
		op.add(Builder::recoveryPoint, Point._DESERIALIZER, "recovery_point");
		op.add(Builder::sources, JsonpDeserializer.arrayDeserializer(RecoverySource._DESERIALIZER), "sources");

	}

}
