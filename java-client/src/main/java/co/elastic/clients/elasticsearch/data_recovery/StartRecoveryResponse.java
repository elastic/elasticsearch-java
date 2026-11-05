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

// typedef: data_recovery.start_recovery.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.start_recovery.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartRecoveryResponse implements JsonpSerializable {
	private final String recoveryId;

	private final Point recoveryPoint;

	private final List<ResolvedRecoverySource> resolvedSources;

	// ---------------------------------------------------------------------------------------------

	private StartRecoveryResponse(Builder builder) {

		this.recoveryId = ApiTypeHelper.requireNonNull(builder.recoveryId, this, "recoveryId");
		this.recoveryPoint = ApiTypeHelper.requireNonNull(builder.recoveryPoint, this, "recoveryPoint");
		this.resolvedSources = ApiTypeHelper.unmodifiableRequired(builder.resolvedSources, this, "resolvedSources");

	}

	public static StartRecoveryResponse of(Function<Builder, ObjectBuilder<StartRecoveryResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier of the recovery that was started.
	 * <p>
	 * API name: {@code recovery_id}
	 */
	public final String recoveryId() {
		return this.recoveryId;
	}

	/**
	 * Required - The recovery point that the sources are recovered from.
	 * <p>
	 * API name: {@code recovery_point}
	 */
	public final Point recoveryPoint() {
		return this.recoveryPoint;
	}

	/**
	 * Required - The sources that the requested source expressions resolved to,
	 * with the destinations that they are recovered to.
	 * <p>
	 * API name: {@code resolved_sources}
	 */
	public final List<ResolvedRecoverySource> resolvedSources() {
		return this.resolvedSources;
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

		generator.writeKey("recovery_id");
		generator.write(this.recoveryId);

		generator.writeKey("recovery_point");
		this.recoveryPoint.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.resolvedSources)) {
			generator.writeKey("resolved_sources");
			generator.writeStartArray();
			for (ResolvedRecoverySource item0 : this.resolvedSources) {
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
	 * Builder for {@link StartRecoveryResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StartRecoveryResponse> {
		private String recoveryId;

		private Point recoveryPoint;

		private List<ResolvedRecoverySource> resolvedSources;

		/**
		 * Required - The identifier of the recovery that was started.
		 * <p>
		 * API name: {@code recovery_id}
		 */
		public final Builder recoveryId(String value) {
			this.recoveryId = value;
			return this;
		}

		/**
		 * Required - The recovery point that the sources are recovered from.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final Builder recoveryPoint(Point value) {
			this.recoveryPoint = value;
			return this;
		}

		/**
		 * Required - The recovery point that the sources are recovered from.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final Builder recoveryPoint(Function<Point.Builder, ObjectBuilder<Point>> fn) {
			return this.recoveryPoint(fn.apply(new Point.Builder()).build());
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code resolved_sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>resolvedSources</code>.
		 */
		public final Builder resolvedSources(List<ResolvedRecoverySource> list) {
			this.resolvedSources = _listAddAll(this.resolvedSources, list);
			return this;
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code resolved_sources}
		 * <p>
		 * Adds one or more values to <code>resolvedSources</code>.
		 */
		public final Builder resolvedSources(ResolvedRecoverySource value, ResolvedRecoverySource... values) {
			this.resolvedSources = _listAdd(this.resolvedSources, value, values);
			return this;
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code resolved_sources}
		 * <p>
		 * Adds a value to <code>resolvedSources</code> using a builder lambda.
		 */
		public final Builder resolvedSources(
				Function<ResolvedRecoverySource.Builder, ObjectBuilder<ResolvedRecoverySource>> fn) {
			return resolvedSources(fn.apply(new ResolvedRecoverySource.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartRecoveryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartRecoveryResponse build() {
			_checkSingleUse();

			return new StartRecoveryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartRecoveryResponse}
	 */
	public static final JsonpDeserializer<StartRecoveryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartRecoveryResponse::setupStartRecoveryResponseDeserializer);

	protected static void setupStartRecoveryResponseDeserializer(ObjectDeserializer<StartRecoveryResponse.Builder> op) {

		op.add(Builder::recoveryId, JsonpDeserializer.stringDeserializer(), "recovery_id");
		op.add(Builder::recoveryPoint, Point._DESERIALIZER, "recovery_point");
		op.add(Builder::resolvedSources, JsonpDeserializer.arrayDeserializer(ResolvedRecoverySource._DESERIALIZER),
				"resolved_sources");

	}

}
