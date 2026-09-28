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

import co.elastic.clients.elasticsearch.data_recovery.get_recovery_points.RecoveryPoint;
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

// typedef: data_recovery.get_recovery_points.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_recovery_points.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRecoveryPointsResponse implements JsonpSerializable {
	private final List<RecoveryPoint> recoveryPoints;

	// ---------------------------------------------------------------------------------------------

	private GetRecoveryPointsResponse(Builder builder) {

		this.recoveryPoints = ApiTypeHelper.unmodifiableRequired(builder.recoveryPoints, this, "recoveryPoints");

	}

	public static GetRecoveryPointsResponse of(Function<Builder, ObjectBuilder<GetRecoveryPointsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Recovery points in descending order by end time.
	 * <p>
	 * API name: {@code recovery_points}
	 */
	public final List<RecoveryPoint> recoveryPoints() {
		return this.recoveryPoints;
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

		if (ApiTypeHelper.isDefined(this.recoveryPoints)) {
			generator.writeKey("recovery_points");
			generator.writeStartArray();
			for (RecoveryPoint item0 : this.recoveryPoints) {
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
	 * Builder for {@link GetRecoveryPointsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRecoveryPointsResponse> {
		private List<RecoveryPoint> recoveryPoints;

		/**
		 * Required - Recovery points in descending order by end time.
		 * <p>
		 * API name: {@code recovery_points}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>recoveryPoints</code>.
		 */
		public final Builder recoveryPoints(List<RecoveryPoint> list) {
			this.recoveryPoints = _listAddAll(this.recoveryPoints, list);
			return this;
		}

		/**
		 * Required - Recovery points in descending order by end time.
		 * <p>
		 * API name: {@code recovery_points}
		 * <p>
		 * Adds one or more values to <code>recoveryPoints</code>.
		 */
		public final Builder recoveryPoints(RecoveryPoint value, RecoveryPoint... values) {
			this.recoveryPoints = _listAdd(this.recoveryPoints, value, values);
			return this;
		}

		/**
		 * Required - Recovery points in descending order by end time.
		 * <p>
		 * API name: {@code recovery_points}
		 * <p>
		 * Adds a value to <code>recoveryPoints</code> using a builder lambda.
		 */
		public final Builder recoveryPoints(Function<RecoveryPoint.Builder, ObjectBuilder<RecoveryPoint>> fn) {
			return recoveryPoints(fn.apply(new RecoveryPoint.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRecoveryPointsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecoveryPointsResponse build() {
			_checkSingleUse();

			return new GetRecoveryPointsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecoveryPointsResponse}
	 */
	public static final JsonpDeserializer<GetRecoveryPointsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecoveryPointsResponse::setupGetRecoveryPointsResponseDeserializer);

	protected static void setupGetRecoveryPointsResponseDeserializer(
			ObjectDeserializer<GetRecoveryPointsResponse.Builder> op) {

		op.add(Builder::recoveryPoints, JsonpDeserializer.arrayDeserializer(RecoveryPoint._DESERIALIZER),
				"recovery_points");

	}

}
