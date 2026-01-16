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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.elasticsearch._types.HealthStatus;
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

// typedef: transform.get_transform_stats.TransformStatsHealth

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformStatsHealth">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformStatsHealth implements JsonpSerializable {
	private final HealthStatus status;

	private final List<TransformHealthIssue> issues;

	// ---------------------------------------------------------------------------------------------

	private TransformStatsHealth(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.issues = ApiTypeHelper.unmodifiable(builder.issues);

	}

	public static TransformStatsHealth of(Function<Builder, ObjectBuilder<TransformStatsHealth>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final HealthStatus status() {
		return this.status;
	}

	/**
	 * If a non-healthy status is returned, contains a list of issues of the
	 * transform.
	 * <p>
	 * API name: {@code issues}
	 */
	public final List<TransformHealthIssue> issues() {
		return this.issues;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.issues)) {
			generator.writeKey("issues");
			generator.writeStartArray();
			for (TransformHealthIssue item0 : this.issues) {
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
	 * Builder for {@link TransformStatsHealth}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformStatsHealth> {
		private HealthStatus status;

		@Nullable
		private List<TransformHealthIssue> issues;

		public Builder() {
		}
		private Builder(TransformStatsHealth instance) {
			this.status = instance.status;
			this.issues = instance.issues;

		}
		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(HealthStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * If a non-healthy status is returned, contains a list of issues of the
		 * transform.
		 * <p>
		 * API name: {@code issues}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>issues</code>.
		 */
		public final Builder issues(List<TransformHealthIssue> list) {
			this.issues = _listAddAll(this.issues, list);
			return this;
		}

		/**
		 * If a non-healthy status is returned, contains a list of issues of the
		 * transform.
		 * <p>
		 * API name: {@code issues}
		 * <p>
		 * Adds one or more values to <code>issues</code>.
		 */
		public final Builder issues(TransformHealthIssue value, TransformHealthIssue... values) {
			this.issues = _listAdd(this.issues, value, values);
			return this;
		}

		/**
		 * If a non-healthy status is returned, contains a list of issues of the
		 * transform.
		 * <p>
		 * API name: {@code issues}
		 * <p>
		 * Adds a value to <code>issues</code> using a builder lambda.
		 */
		public final Builder issues(Function<TransformHealthIssue.Builder, ObjectBuilder<TransformHealthIssue>> fn) {
			return issues(fn.apply(new TransformHealthIssue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformStatsHealth}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformStatsHealth build() {
			_checkSingleUse();

			return new TransformStatsHealth(this);
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
	 * Json deserializer for {@link TransformStatsHealth}
	 */
	public static final JsonpDeserializer<TransformStatsHealth> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformStatsHealth::setupTransformStatsHealthDeserializer);

	protected static void setupTransformStatsHealthDeserializer(ObjectDeserializer<TransformStatsHealth.Builder> op) {

		op.add(Builder::status, HealthStatus._DESERIALIZER, "status");
		op.add(Builder::issues, JsonpDeserializer.arrayDeserializer(TransformHealthIssue._DESERIALIZER), "issues");

	}

}
