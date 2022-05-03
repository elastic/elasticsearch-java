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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.ClusterAppliedStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#nodes._types.ClusterAppliedStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterAppliedStats implements JsonpSerializable {
	private final List<Recording> recordings;

	// ---------------------------------------------------------------------------------------------

	private ClusterAppliedStats(Builder builder) {

		this.recordings = ApiTypeHelper.unmodifiable(builder.recordings);

	}

	public static ClusterAppliedStats of(Function<Builder, ObjectBuilder<ClusterAppliedStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code recordings}
	 */
	public final List<Recording> recordings() {
		return this.recordings;
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

		if (ApiTypeHelper.isDefined(this.recordings)) {
			generator.writeKey("recordings");
			generator.writeStartArray();
			for (Recording item0 : this.recordings) {
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
	 * Builder for {@link ClusterAppliedStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterAppliedStats> {
		@Nullable
		private List<Recording> recordings;

		/**
		 * API name: {@code recordings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>recordings</code>.
		 */
		public final Builder recordings(List<Recording> list) {
			this.recordings = _listAddAll(this.recordings, list);
			return this;
		}

		/**
		 * API name: {@code recordings}
		 * <p>
		 * Adds one or more values to <code>recordings</code>.
		 */
		public final Builder recordings(Recording value, Recording... values) {
			this.recordings = _listAdd(this.recordings, value, values);
			return this;
		}

		/**
		 * API name: {@code recordings}
		 * <p>
		 * Adds a value to <code>recordings</code> using a builder lambda.
		 */
		public final Builder recordings(Function<Recording.Builder, ObjectBuilder<Recording>> fn) {
			return recordings(fn.apply(new Recording.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterAppliedStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterAppliedStats build() {
			_checkSingleUse();

			return new ClusterAppliedStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterAppliedStats}
	 */
	public static final JsonpDeserializer<ClusterAppliedStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterAppliedStats::setupClusterAppliedStatsDeserializer);

	protected static void setupClusterAppliedStatsDeserializer(ObjectDeserializer<ClusterAppliedStats.Builder> op) {

		op.add(Builder::recordings, JsonpDeserializer.arrayDeserializer(Recording._DESERIALIZER), "recordings");

	}

}
