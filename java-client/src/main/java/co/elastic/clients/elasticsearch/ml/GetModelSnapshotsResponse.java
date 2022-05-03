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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshots.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_model_snapshots.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetModelSnapshotsResponse implements JsonpSerializable {
	private final long count;

	private final List<ModelSnapshot> modelSnapshots;

	// ---------------------------------------------------------------------------------------------

	private GetModelSnapshotsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.modelSnapshots = ApiTypeHelper.unmodifiableRequired(builder.modelSnapshots, this, "modelSnapshots");

	}

	public static GetModelSnapshotsResponse of(Function<Builder, ObjectBuilder<GetModelSnapshotsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code model_snapshots}
	 */
	public final List<ModelSnapshot> modelSnapshots() {
		return this.modelSnapshots;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.modelSnapshots)) {
			generator.writeKey("model_snapshots");
			generator.writeStartArray();
			for (ModelSnapshot item0 : this.modelSnapshots) {
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
	 * Builder for {@link GetModelSnapshotsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetModelSnapshotsResponse> {
		private Long count;

		private List<ModelSnapshot> modelSnapshots;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>modelSnapshots</code>.
		 */
		public final Builder modelSnapshots(List<ModelSnapshot> list) {
			this.modelSnapshots = _listAddAll(this.modelSnapshots, list);
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 * <p>
		 * Adds one or more values to <code>modelSnapshots</code>.
		 */
		public final Builder modelSnapshots(ModelSnapshot value, ModelSnapshot... values) {
			this.modelSnapshots = _listAdd(this.modelSnapshots, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshots}
		 * <p>
		 * Adds a value to <code>modelSnapshots</code> using a builder lambda.
		 */
		public final Builder modelSnapshots(Function<ModelSnapshot.Builder, ObjectBuilder<ModelSnapshot>> fn) {
			return modelSnapshots(fn.apply(new ModelSnapshot.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetModelSnapshotsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotsResponse build() {
			_checkSingleUse();

			return new GetModelSnapshotsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotsResponse}
	 */
	public static final JsonpDeserializer<GetModelSnapshotsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetModelSnapshotsResponse::setupGetModelSnapshotsResponseDeserializer);

	protected static void setupGetModelSnapshotsResponseDeserializer(
			ObjectDeserializer<GetModelSnapshotsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::modelSnapshots, JsonpDeserializer.arrayDeserializer(ModelSnapshot._DESERIALIZER),
				"model_snapshots");

	}

}
